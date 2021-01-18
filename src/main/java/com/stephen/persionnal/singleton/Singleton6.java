package com.stephen.persionnal.singleton;

/**
 * 在内部类被加载时才创建实例对象
 * 静态内部类不会随着外部类的加载和初始化而初始化
 */
public class Singleton6 {
    private Singleton6(){

    }
    private static class Inner{
        private static final Singleton6 INSTANCE = new Singleton6();
    }
    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
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
        return "Singleton6{" +
                "name='" + name + '\'' +
                '}';
    }
}
