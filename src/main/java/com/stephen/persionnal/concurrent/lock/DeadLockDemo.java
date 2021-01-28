package com.stephen.persionnal.concurrent.lock;

import java.util.concurrent.TimeUnit;

class HoldLock implements Runnable{
    private String lockA;
    private String lockB;

    public HoldLock(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName()+" 自己持有的锁 "+lockA+" 尝试获得 "+lockB);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lockB){
                System.out.println(Thread.currentThread().getName()+" 自己持有的锁 "+lockB+" 尝试获得 "+lockA);
            }
        }
    }
}
/**
 * 死锁代码
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(
            new HoldLock(lockA,lockB),"A"
        ).start();
        new Thread(
                new HoldLock(lockB,lockA),"A"
        ).start();

        /**
         * jps 用来查看有权访问的hotspot的虚拟机进程
         */
    }
}
