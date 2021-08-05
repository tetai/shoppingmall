package org.linlinjava.litemall.db.canal;



import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.domain.MoneyLog
 ****/

public class MoneyLog implements Serializable {

    private String id;
    private Double money;
    private Date createtime;
    private String username;
    public MoneyLog(){};
    public MoneyLog(Double money, String username) {
        this.money = money;
        this.username = username;
        this.id= UUID.randomUUID().toString();
        this.createtime = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
