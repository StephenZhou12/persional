package com.stephen.persionnal.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * OutOfMemoryError:GC overhead limit exceeded演示
 * 修改参数：-Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 */
public class OverHeadDemo {
    public static void main(String[] args) {
        int i=0;
        List<String> list = new ArrayList<>();
        try{
            while (true){
                list.add(String.valueOf(++i).intern());
            }
        }catch (Throwable a){
            System.out.println("************"+i);
            a.getStackTrace();
            throw  a;
        }

    }
}
