package com.ysr.demo3;

import org.springframework.context.ApplicationContext;

/**
 * Created by Administrator on 2018/3/27.
 */
public class Demo3Entity2 implements MySpringContext {

    private ApplicationContext context;

    @Override
    public void setApplication(ApplicationContext context) {
            this.context = context;
    }

    public void show(){
        System.out.println(context);
    }
}
