package org.zkz.litemall.db.redis.lock;

import org.redisson.api.RLock;

import java.util.concurrent.TimeUnit;

public interface DistributedLocker {

    /***
     * lock(), 拿不到lock就不罢休，不然线程就一直block
     * @param lockKey
     * @return
     */
    RLock lock(String lockKey);
    /***
     * timeout为加锁时间，单位为秒
     * @param lockKey
     * @param timeout
     * @return
     */
    RLock lock(String lockKey, long timeout);
    /***
     * timeout为加锁时间，时间单位由unit确定
     * @param lockKey
     * @param unit
     * @param timeout
     * @return
     */
    RLock lock(String lockKey, TimeUnit unit, long timeout);
    /***
     * tryLock()，马上返回，拿到lock就返回true，不然返回false。
     * 带时间限制的tryLock()，拿不到lock，就等一段时间，超时返回false.
     实现上面接口中对应的锁管理方法,编写一个锁管理类RedissonDistributedLocker ，代码如下：
     * @param lockKey
     * @param unit
     * @param waitTime
     * @param leaseTime 租赁时间，如果超过指定时间还没解锁，就强制解锁
     * @return
     */
    boolean tryLock(String lockKey, TimeUnit unit, long waitTime, long leaseTime);
    /***
     * 解锁
     * @param lockKey
     */
    void unlock(String lockKey);
    /***
     * 解锁
     * @param lock
     */
    void unlock(RLock lock);
}
