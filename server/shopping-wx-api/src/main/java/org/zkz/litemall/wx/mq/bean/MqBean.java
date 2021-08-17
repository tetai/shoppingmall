package org.zkz.litemall.wx.mq.bean;

import io.swagger.models.auth.In;

import java.io.Serializable;

public class MqBean  implements Serializable {

    private String messageId;
    private String createTime;
    private Integer userId;
    private Integer goodsId;

    public MqBean() {
    }

    @Override
    public String toString() {
        return "MqBean{" +
                "messageId='" + messageId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                '}';
    }

    public MqBean(String messageId, String createTime, Integer userId, Integer goodsId) {
        this.messageId = messageId;
        this.createTime = createTime;
        this.userId = userId;
        this.goodsId = goodsId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}
