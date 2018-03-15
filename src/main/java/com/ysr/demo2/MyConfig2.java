package com.ysr.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig2 {
	
	@Bean
	public BeanNeedInit creatBean(){
		return new BeanNeedInit();
	}
	
	@Bean(initMethod="init",destroyMethod="des")
	public BeanNeedInitAndDes2 creatBean2(){
		return new BeanNeedInitAndDes2();
	}
}
