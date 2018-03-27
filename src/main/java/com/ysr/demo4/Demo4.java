package com.ysr.demo4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2018/3/27.
 */

public class Demo4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =   new AnnotationConfigApplicationContext("com.ysr.demo4");
        Thread thread  = context.getBean(Thread.class);
        Person p  = context.getBean(Person.class);
        System.out.println(thread);
        System.out.println(p);
    }
}
