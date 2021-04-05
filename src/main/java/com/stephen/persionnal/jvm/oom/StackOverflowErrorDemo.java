package com.stephen.persionnal.jvm.oom;

/**
 * StackOverflowError演示
 */
public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        stackOver();
    }

    private static void stackOver() {
        stackOver();
    }

}
