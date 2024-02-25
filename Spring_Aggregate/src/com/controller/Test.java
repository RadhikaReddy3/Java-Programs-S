package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pojo.Manager;

public class Test {
    
    public static void main(String[] args) {
        
        ApplicationContext c = new AnnotationConfigApplicationContext(OurConf.class);
        System.out.println(c);
        Manager m = c.getBean(Manager.class);
        m.doWork();
    }
}
