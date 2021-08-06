package org.zkz.litemall.db.canal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

@CanalTable(value = "money_log")
@Component
public class MoneyLogSync implements EntryHandler<MoneyLog> {

    @Autowired
    private RedisTemplate redisTemplate;
    /***
     * 数据增加变更
     * @param moneyLog
     */
    @Override
    public void insert(MoneyLog moneyLog) {
        System.out.println(moneyLog.getUsername());
        //将数据存入到Redis
//        redisTemplate.boundHashOps("UserMoneyLog").put(moneyLog.getUsername(),moneyLogs);
    }

    @Override
    public void update(MoneyLog before, MoneyLog after) {
        System.out.println(after.getUsername());
    }
}