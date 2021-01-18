package com.stephen.persionnal.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Singleton3 {
    public static final Singleton3 INSATANCE;
    static{
        Properties p = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("D:\\project\\src\\main\\java\\com\\stephen\\persionnal\\singleton\\singleton.properties");
            p.load(Singleton3.class.getResourceAsStream("singketon.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        INSATANCE = new Singleton3();
    }
    private Singleton3(){

    }
}
