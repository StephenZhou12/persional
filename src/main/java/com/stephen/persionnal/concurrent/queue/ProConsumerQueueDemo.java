package com.stephen.persionnal.concurrent.queue;


import com.alibaba.druid.util.StringUtils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;



class MyResouce{
    private volatile boolean flag = true;//默认开启，进行生产+消费
    private AtomicInteger atomicInteger = new AtomicInteger();
    BlockingQueue<String> blockingQueue = null;

    public MyResouce(BlockingQueue<String> blockingQueue) {
        System.out.println(blockingQueue.getClass().getName());
        this.blockingQueue = blockingQueue;
    }
    public void myProd() throws Exception{
        String data = null;
        boolean reValue = false;
        while (flag){
            //相当于i++后再转换成String
            data = String.valueOf(atomicInteger.incrementAndGet());
            reValue = blockingQueue.offer(data,2l, TimeUnit.SECONDS);
            if(reValue){
                System.out.println(Thread.currentThread().getName()+" 插入队列成功 "+data);
            }else{
                System.out.println(Thread.currentThread().getName()+" 插入队列失败 "+data);
            }
            /*if(data.equals("10")){
                flag = false;
            }*/
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println(Thread.currentThread().getName()+"生产结束");
    }

    public void myConsumer() throws Exception
    {
        String result = null;
        while (flag){
            result = blockingQueue.poll(2l,TimeUnit.SECONDS);

            if(StringUtils.isEmpty(result)){
                flag = false;
                System.out.println(Thread.currentThread().getName()+" 超过2秒钟没有取到值，退出");
                return;
            }
            System.out.println(Thread.currentThread().getName()+" 消费队列成功 "+result);
        }
    }

    public void stop(){
        flag = false;
    }

}
/**
 * 生产者/消费者模式，阻塞队列版
 */
public class ProConsumerQueueDemo {
    public static void main(String[] args) throws Exception{
        MyResouce myResouce = new MyResouce(new ArrayBlockingQueue<String>(3));
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" 生产线程启动");
            try {
                myResouce.myProd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"pro").start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" 消费线程启动");
            try {
                myResouce.myConsumer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"con").start();
        TimeUnit.SECONDS.sleep(5);
        myResouce.stop();
    }
}
