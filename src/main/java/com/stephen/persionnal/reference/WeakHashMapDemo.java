package com.stephen.persionnal.reference;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        //myHashMap();
        myWeakHashMap();
    }

    private static void myWeakHashMap() {
        WeakHashMap<Integer,String> hashMap = new WeakHashMap<>();
        Integer key = new Integer(1);
        String value = "map";
        hashMap.put(key,value);
        System.out.println(hashMap);
        key= null;
        System.out.println(hashMap);
        System.gc();
        System.out.println(hashMap+"  "+hashMap.size());
    }

    private static void myHashMap() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        Integer key = new Integer(1);
        String value = "map";
        hashMap.put(key,value);
        System.out.println(hashMap);
        key= null;
        System.out.println(hashMap);
        System.gc();
        System.out.println(hashMap+"  "+hashMap.size());
    }
}
