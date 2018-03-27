package com.ysr.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/3/27.
 */
@Configuration
public class ConfigDemo3 {

    @Bean
    public Demo3Entity createEntity(){
        return new Demo3Entity();
    }

    @Bean
    public Demo3Entity2 createEntity2(){
        return new Demo3Entity2();
    }
}
