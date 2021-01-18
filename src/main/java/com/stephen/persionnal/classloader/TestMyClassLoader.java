package com.stephen.persionnal.classloader;

import com.stephen.persionnal.classinit.Son;

public class TestMyClassLoader {
    public static void main(String[] args) throws Exception{

        MyClassLoader myClassLoader = new MyClassLoader("thisMyClass","E:");
        Class<?> c = myClassLoader.findClass("Demo");
       c.newInstance();
        //son.testson();
    }
}
