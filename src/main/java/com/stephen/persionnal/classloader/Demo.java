package com.stephen.persionnal.classloader;

public class Demo {
    public static int temp =1;
    static{
        temp =2;
        System.out.println(temp);
    }

    public static void main(String[] args) {
        temp =3;
        System.out.println(temp);
    }
}
