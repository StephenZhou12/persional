package com.stephen.persionnal.jvm.oom;

import java.util.Random;

/**
 * .java.lang.OutOfMemoryError:java heap space演示
 * 修改参数-Xms10m -Xmx10m
 */
public class HeapSpaceDemo {
    public static void main(String[] args) {
        String str = "suu";
        while (true){
            str += str + new Random().nextInt(11111111)+ new Random().nextInt(22222222);
            //返回字符串对象的规范化表示形式
            str.intern();
        }
    }
}
