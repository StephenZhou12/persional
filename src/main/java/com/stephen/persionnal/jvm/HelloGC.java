package com.stephen.persionnal.jvm;

public class HelloGC {
    //-XX:+PrintGCDetails -XX:MetaspaceSize=5000
    public static void main(String[] args) throws Exception{
        System.out.println("***********");
        Thread.sleep(Integer.MAX_VALUE);
        System.out.println(Runtime.getRuntime().totalMemory());//jvm内存总量
        System.out.println(Runtime.getRuntime().maxMemory());//最大内存
    }
}
