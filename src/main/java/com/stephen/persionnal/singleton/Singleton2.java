package com.stephen.persionnal.singleton;

/**
 * 表示该类型的对象是有限的几个
 * 我们可以限定一个，就成了单例了
 */
public enum Singleton2 {
    INSTANCE;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton2{" +
                "name='" + name + '\'' +
                '}';
    }
}
