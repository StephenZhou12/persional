package com.stephen.persionnal.jvm;

public class HelloGC {
    //-XX:+PrintGCDetails -XX:MetaspaceSize=5000   -XX:+PrintCommandLineFlags
    //-XX:+PrintGCDetails -Xms10m -Xmx10m -XX:+UseSerialGC -XX:SurvivorRatio=8 -XX:NewRatio=4
    public static void main(String[] args) throws Exception{
        System.out.println("***********");
        Thread.sleep(Integer.MAX_VALUE);
        System.out.println(Runtime.getRuntime().totalMemory());//jvm内存总量
        System.out.println(Runtime.getRuntime().maxMemory());//最大内存
        byte[] bytes = new byte[50*1024*1024];

    }
}
