package com.stephen.persionnal.reference;

public class StrongReferenceDemo {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 =null;
        System.out.println(o1);
        o1=null;
        System.gc();
        System.out.println(o1);
        System.out.println(o2);
    }
}
