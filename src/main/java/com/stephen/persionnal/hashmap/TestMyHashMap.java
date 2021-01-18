package com.stephen.persionnal.hashmap;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap<Integer,Object>  myHashMap =new MyHashMap<>();
        myHashMap.put(23,"24");
        System.out.println(myHashMap.put(23,"23"));
        myHashMap.put(24,"24");
        myHashMap.put(25,"25");
        System.out.println(myHashMap.get(23));
        System.out.println(myHashMap.size());
    }
}
