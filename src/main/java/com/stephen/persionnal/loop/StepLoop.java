package com.stephen.persionnal.loop;

import org.junit.Test;

public class StepLoop {

    @Test
    public void test01(){
        System.out.println(fn(4));
        System.out.println(loop(4));
    }
    /**
     * 递归调用
     * @param n
     * @return
     */
    public int fn(int n){
        if(n==1||n==2){
            return n;
        }
        return fn(n-2)+fn(n-1);
    }
    public int loop(int n){
        if(n==1||n==2){
            return n;
        }
        int one =2;
        int two =1;
        int sum =0;

        for(int i=3;i<=n;i++){
            sum=one+two;
            two=one;
            one=sum;
        }

        return sum;
    }
}
