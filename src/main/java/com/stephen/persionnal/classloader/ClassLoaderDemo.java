package com.stephen.persionnal.classloader;

public class ClassLoaderDemo {
    public static void main(String[] args) {
       // System.out.println(ClassLoaderDemo.class.getClassLoader());
        ClassLoader classLoader = ClassLoaderDemo.class.getClassLoader();
        while (classLoader != null){
            System.out.println(classLoader);
            classLoader = classLoader.getParent();
        }
        System.out.println(classLoader);
    }
}
