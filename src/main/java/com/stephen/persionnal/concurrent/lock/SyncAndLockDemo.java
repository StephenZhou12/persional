package com.stephen.persionnal.concurrent.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程之间按照顺序调用，实现A-B-C线程顺序启动
 */
class ShareResouce{
    private int num = 1;//A:1,B:2,C:3
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void print(){
        lock.lock();
        try{
            //判断
            while(num != 1){
                c1.await();
            }
            //干活
            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread().getName()+" num "+num);
            }
            //通知
            num=2;
            c2.signal();
        }catch (Exception e){
            e.getStackTrace();
        } finally {
            lock.unlock();
        }

    }
    public void print1(){
        lock.lock();
        try{
            //判断
            while(num != 2){
                c2.await();
            }
            //干活
            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread().getName()+" num "+num);
            }
            //通知
            num=3;
            c3.signal();
        }catch (Exception e){
            e.getStackTrace();
        } finally {
            lock.unlock();
        }

    }
    public void print2(){
        lock.lock();
        try{
            //判断
            while(num != 3){
                c3.await();
            }
            //干活
            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread().getName()+" num "+num);
            }
            //通知
            num=1;
            c1.signal();
        }catch (Exception e){
            e.getStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
public class SyncAndLockDemo {
    public static void main(String[] args) {
        ShareResouce shareResouce = new ShareResouce();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                shareResouce.print();
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                shareResouce.print1();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                shareResouce.print2();
            }
        },"C").start();
    }
}
