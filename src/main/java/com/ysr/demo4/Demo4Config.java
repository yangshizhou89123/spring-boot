package com.ysr.demo4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/3/27.
 */
@Configuration
public class Demo4Config {

    @Bean
    public Thread createTread(){
        return new Thread();
    }
}
