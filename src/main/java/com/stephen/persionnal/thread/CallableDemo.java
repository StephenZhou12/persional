package com.stephen.persionnal.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("call menthid");
        return 1024;
    }
}
/**
 * 获取多线程的方式
 */
public class CallableDemo {
    public static void main(String[] args) throws Exception {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());

        Thread t1 = new Thread(futureTask,"A");
        t1.start();
        Thread t2 = new Thread(futureTask,"B");
        t2.start();
        while(!futureTask.isDone()){

        }
        System.out.println("****result" + futureTask.get());
    }
}
