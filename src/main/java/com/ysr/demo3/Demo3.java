package com.ysr.demo3;

import com.ysr.demo1.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2018/3/27.
 */

public class Demo3 {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =   new AnnotationConfigApplicationContext("com.ysr.demo3");
        Demo3Entity2 entity  =  context.getBean(Demo3Entity2.class);
        entity.show();
        System.out.println(entity);
    }
}
