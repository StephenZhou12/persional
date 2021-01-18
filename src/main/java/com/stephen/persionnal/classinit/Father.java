package com.stephen.persionnal.classinit;

/**
 * 父类的初始化执行顺序clint
 * 1.j=method()
 * 2.父类的静态代码块
 *
 *
 * 父类的实例化方法执行顺序
 * 1.super方法
 * 2.i=test()
 * 3.父类的非静态代码块
 * 4.父类的无参构造
 */
public class Father {
    private int i=test();
    private static int j = menthod();
    static{
        System.out.println("1");
    }
    Father(){
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
    public int test(){
        System.out.println("4");
        return 1;
    }
    public static int menthod(){
        System.out.println("5");
        return 1;
    }
}
