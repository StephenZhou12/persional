package com.stephen.persionnal.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池的三种实现方式
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {
        //查看计算机核数
        //System.out.println(Runtime.getRuntime().availableProcessors());
        /*1池5个线程
        *创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
         */
        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        //1池1个线程
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        //1池N线程
        ExecutorService executorService = Executors.newCachedThreadPool();
        try{
            for (int i = 0; i <10 ; i++) {
                executorService.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"****");
                });
                TimeUnit.SECONDS.sleep(1);
            }

        }catch (Exception e){
            e.getStackTrace();
        }finally {
            //关闭
            executorService.shutdown();
        }
    }
}
