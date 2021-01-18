package com.stephen.persionnal.test;

public class TestCase {
    public static void main(String[] args) throws Exception{
        //k=11,
        /**
         * 赋值= 最后计算
         * =右边的从左到右依次压入操作数栈
         * 实际先算哪个，看优先级
         * 自增、自减操作都是直接修改变量值，不经过操作数栈
         * 最后赋值之前，零时结果也是存储在操作数栈
         */
        int i=1;
        i=i++;
        //System.out.println(i);
        int j=i++;
        //System.out.println(i);
        //System.out.println(j);
        int k= i+ ++i *i++;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        Thread.sleep(Long.MAX_VALUE);
    }
}
