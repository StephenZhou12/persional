package com.stephen.persionnal.singleton;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.*;

public class TestCase {

    @Test
    public void test01(){
        Singleton1 s = Singleton1.INSTANCE;
        s.setName("zhangshan");
        System.out.println(s);
    }

    @Test
    public void test02(){
        Singleton2 s = Singleton2.INSTANCE;
        s.setName("zhangshan");
        System.out.println(s);
    }

    @Test
    public void test03(){
        Properties p = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("D:\\project\\src\\main\\java\\com\\stephen\\persionnal\\singleton\\singleton.properties");
            p.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(p);
        //System.out.println(p.get("name"));
    }
    @Test
    public void test04(){
        Singleton4 instance1 = Singleton4.getInstance();
        //instance.setName("zhangsan");
        //System.out.println(instance);
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    @Test
    public void test05()throws Exception{
        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        //创建一个有两个现成的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> future1 = es.submit(c);
        Future<Singleton4> future2 = es.submit(c);
        //获取实例
        Singleton4 s1 = future1.get();
        Singleton4 s2 = future2.get();
        System.out.println("s1 hash code is : "+s1.hashCode()+" s2 hash code is : "+s2.hashCode());
        System.out.println(s1==s2);
    }
    @Test
    public void test06()throws Exception{
        Callable<Singleton5> c = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };
        //创建一个有两个现成的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton5> future1 = es.submit(c);
        Future<Singleton5> future2 = es.submit(c);
        //获取实例
        Singleton5 s1 = future1.get();
        Singleton5 s2 = future2.get();
        System.out.println("s1 hash code is : "+s1.hashCode()+" s2 hash code is : "+s2.hashCode());
        System.out.println(s1==s2);
    }
    @Test
    public void test07(){
        Singleton6 singleton6 = Singleton6.getInstance();
        singleton6.setName("zhangshan");
        System.out.println(singleton6);
    }
}
