package org.zkz.litemall.wx.mq.send;

import com.alibaba.fastjson.JSONObject;
import org.redisson.api.RLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.zkz.litemall.db.redis.RedisUtil;
import org.zkz.litemall.db.redis.lock.DistributedLocker;
import org.zkz.litemall.wx.mq.bean.MqBean;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Configuration
public class SendMessage {

    Logger logger = LoggerFactory.getLogger(SendMessage.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;  //使用RabbitTemplate,这提供了接收/发送等等方法
    @Resource
    private RedisUtil redisUtil;

    @Autowired
    private DistributedLocker distributedLocker;


    private final static String GOODS_COUNT = "GOODS_COUNT";
    private final static String GOODS_COUNT_LOCK = "GOODS_COUNT_LOCK";

    /**
     * 1、判断Redis中是否有足够商品，有的话预扣减Redis数据
     * 2、发送到mq
     * @param userId
     * @return
     */
    public boolean sendDirectMessage(Integer userId) {
        if (userId == null || userId == 0) {
            logger.info("用户未登录");
            return false;
        }
//        redisUtil.set(GOODS_COUNT, 10000);
        // 使用redission分布式锁
//        RLock lock = distributedLocker.lock(GOODS_COUNT_LOCK);
        if (distributedLocker.tryLock(GOODS_COUNT_LOCK, TimeUnit.SECONDS, 15l, 15l)) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 拿到锁
            logger.info("Redis中数量={}", redisUtil.get(GOODS_COUNT));
            // 先判断是否有存货.
            if (redisUtil.hasKey(GOODS_COUNT)) {
                if (Integer.parseInt(redisUtil.get(GOODS_COUNT).toString()) <= 0) {
                    // 没有商品，直接返回
                    return false;
                }
            }
            // 减一
            redisUtil.decr(GOODS_COUNT, 1l);
            logger.info("Redis中数量={}", redisUtil.get(GOODS_COUNT));
            String messageId = String.valueOf(UUID.randomUUID());
            String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            MqBean mqBean = new MqBean(messageId, createTime, userId, 1);
            //将消息携带绑定键值：TestDirectRouting 发送到交换机TestDirectExchange
            String message = JSONObject.toJSONString(mqBean);
            logger.info("message={}", message);
            rabbitTemplate.convertAndSend("directExchange", "directRouting", message);
            logger.info("redisson解锁");
            distributedLocker.unlock(GOODS_COUNT_LOCK);
//            lock.unlock();
        }
        return true;
    }


}
