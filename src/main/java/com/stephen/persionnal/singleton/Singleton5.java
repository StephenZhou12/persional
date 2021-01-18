package com.stephen.persionnal.singleton;

/**
 * 懒汉式：延迟去创建实例
 * 1.构造器私有化
 * 2.用一个静态变量保存这个唯一的实例
 * 3.提供一个静态方法，获取这个实例
 * 解决线程不安全问题
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        if(instance == null){
            synchronized (Singleton5.class){
                if(instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton4{" +
                "name='" + name + '\'' +
                '}';
    }
}
