package com.stephen.persionnal.singleton;

/**
 * 懒汉式：延迟去创建实例
 * 1.构造器私有化
 * 2.用一个静态变量保存这个唯一的实例
 * 3.提供一个静态方法，获取这个实例
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
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
