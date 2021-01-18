package com.stephen.persionnal.classinit;

/**
 * 子类初始化执行顺序clint
 * 1.先初始化父类
 * 2.再初始化子类
 *  2.1j=method()
 *  2.2子类静态方法代码块
 *
 *
 * 子类的实例化方法执行顺序
 * 1.调用super()
 * 2.i=testson()
 * 3.子类的非静态代码块
 * 4.子类的无参构造
 */
public class Son extends Father {
    private int i=testson();
    private static int j = menthod();
    static{
        System.out.println("6");
    }
    Son(){
        //super()   在子类的构造其中一定会调用父类的构造器，写或者不写都存在
        System.out.println("7");
    }
    //非静态代码块
    {
        System.out.println("8");
    }
    public int testson(){
        System.out.println("9");
        return 1;
    }
    public static int menthod(){
        System.out.println("10");
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("------------");
        Son s1 = new Son();
    }
}
