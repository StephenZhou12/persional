package com.stephen.persionnal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages="com.stephen.persionnal.spring")
public class PersionnalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersionnalApplication.class, args);
    }

}
