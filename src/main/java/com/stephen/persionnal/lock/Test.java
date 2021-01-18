package com.stephen.persionnal.lock;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.locks.ReentrantLock;

public class Test {
    static L l = new L();
    static ReentrantLock reentrantLock = new ReentrantLock();
    public static void main(String[] args) {
        //lockTest();
        //打印对象的布局
        String layout = ClassLayout.parseInstance(l).toPrintable();
        System.out.println(layout);
        
    }
    public static void lockTest(){
        /*synchronized (Test.class){
            System.out.println("xxx");
        }*/
        //加锁
        reentrantLock.lock();
        System.out.println("zzzz");
        //解锁
        reentrantLock.unlock();
        //锁对象
        /**
         * 上锁就是改变对象的对象头
         */
        synchronized (l){
            System.out.println("xxx");
        }
    }
}
