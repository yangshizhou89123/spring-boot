package com.ysr.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
		MyBean myBean = configApplicationContext.getBean(MyBean.class);
		myBean.doSomeThing();
		
		
		configApplicationContext.close();
	}
}
