package com.stephen.persionnal.spring.springbean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;

public class SpringTest {
    //D:\javaProject\project\src\main\java\com\stephen\persionnal\spring\
    ApplicationContext ap = new FileSystemXmlApplicationContext(new String[] {"D:\\javaProject\\project\\src\\main\\java\\com\\stephen\\persionnal\\spring\\springbean\\bean.xml"});
    @Test
    public void test01() throws Exception{
        //File file = new File("D:\\javaProject\\project\\src\\main\\java\\com\\stephen\\persionnal\\spring\\bean.xml");
        //System.out.println(file.exists());
        Book book1 =(Book) ap.getBean("book");
        Book book2 =(Book) ap.getBean("book");
        System.out.println(book1==book2);
        System.out.println(book1);

    }
}
