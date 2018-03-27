package com.ysr.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/27.
 */
@Component
public class MySpringContextPostProgress implements BeanPostProcessor {

    @Autowired
    private ApplicationContext context;

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(o instanceof MySpringContext){
            MySpringContext m = (MySpringContext) o;
            ((MySpringContext) o).setApplication(context);
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
