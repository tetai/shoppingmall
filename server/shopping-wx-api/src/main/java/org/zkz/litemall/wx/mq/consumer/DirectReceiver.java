package org.zkz.litemall.wx.mq.consumer;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.zkz.litemall.wx.mq.bean.MqBean;
import org.zkz.litemall.wx.mq.send.SendMessage;

import java.util.Map;

@Configuration
@RabbitListener(queues = "directQueue")
public class DirectReceiver {
    Logger logger = LoggerFactory.getLogger(SendMessage.class);
    @RabbitHandler
    public void process(String testMessage) {
        logger.info("DirectReceiver消费者收到消息={}" ,testMessage);
        MqBean mqBean = JSONObject.parseObject(testMessage.toString(), MqBean.class);
        logger.info("DirectReceiver消费者收到消息={}" ,mqBean);
    }

}
