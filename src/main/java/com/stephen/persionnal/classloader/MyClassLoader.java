package com.stephen.persionnal.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 实现自定义类加载器
 */
public class MyClassLoader extends ClassLoader{
    private String path;//加载类的路径
    private String name;//类加载器名称

    public MyClassLoader(String name,String path) {
        //super();//让系统类加载器成为该类的父类
        this.path = path;
        this.name = name;
    }
    public MyClassLoader(ClassLoader classLoader,String name,String path) {
        super(classLoader);//显示指定父类加载器
        this.path = path;
        this.name = name;
    }

    /**
     * 重写findClass就可以了
     * @param name
     * @return
     */
    @Override
    protected Class<?> findClass(String name) {
        byte[] data = new byte[0];
        try {
            data = readClassFileToByteArray(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return super.findClass(name);
        return super.defineClass(name,data,0,data.length);
    }

    /**
     * 获取.class文件字节数组
     * @param name
     * @return
     */
    private byte[] readClassFileToByteArray(String name) throws Exception{
        InputStream in = null;
        byte[] returnData = null;
        name = name.replaceAll("\\.","/");
        String filePath = this.path + name + ".class";
        File file = new File(filePath);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        in = new FileInputStream(file);
        int tem = 0;
        while((tem = in.read()) != -1){
            out.write(tem);
        }
        returnData = out.toByteArray();
        in.close();
        out.close();
        return returnData;
    }
}
