package com.stephen.persionnal.parameter;

import java.util.Arrays;

public class Exam4 {
    public static void main(String[] args) {
        int i =1;
        String str = "hello";
        Integer num = 200;
        int[] arr = {1,2,3,4,5};
        MyData myData = new MyData();
        change(i,str,num,arr,myData);
        System.out.println(i);//1
        System.out.println(str);//hello
        System.out.println(num);
        System.out.println(arr[0]);
        System.out.println(myData.a);
    }
    public static void change(int j,String s,Integer n,int[] a,MyData m){
        j += 1;
        s += "word";
        n += 1;
        a[0] += 1;
        m.a += 1;
    }
}
class MyData{
    int a = 10;
}