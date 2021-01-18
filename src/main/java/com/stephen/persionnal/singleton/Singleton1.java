package com.stephen.persionnal.singleton;

/**
 * 单例模式饿汉式，直接实例化,不管是否需要都会创建
 * 1.构造器私有化
 * 2.自行创建，并用静态变量保存
 * 3.向外提供实例
 * 4.为了强调这是一个单例，可以用final修饰
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){

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
        return "Singleton1{" +
                "name='" + name + '\'' +
                '}';
    }
}
