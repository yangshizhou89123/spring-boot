package com.ysr.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	/*
	 * 创建并注入bean的第一种方式
	 */
	/*@Bean(name="myBean")
	@Scope("propotype")
	public MyBean  creatBean(){
		return new MyBean();
	}*/
	
	/*
	 * 创建并注入bean的第二种方式：实现FactoryBean接口
	 */
	/*@Bean
	public MyBeanFactoryBean createMyBeanFactoryBean(){
		return new MyBeanFactoryBean();
	}*/
	
	
	/*
	 * 创建并注入bean的第三种方式：实现Factory类
	 */
	@Bean
	public MyBeanFactory createMyBeanFactoryBean(){
		return new MyBeanFactory();
	}
	
	
	@Bean
	public MyBean createMyBean(MyBeanFactory factory){
		return factory.create();
	}
}
