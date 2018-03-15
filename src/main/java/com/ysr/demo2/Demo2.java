package com.ysr.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MyConfig2.class);
		BeanNeedInit beanNeedInit = configApplicationContext.getBean(BeanNeedInit.class);
		System.out.println(beanNeedInit);
		
		BeanNeedInitAndDes2 beanNeedInit2 = configApplicationContext.getBean(BeanNeedInitAndDes2.class);
		System.out.println(beanNeedInit2);
		
		configApplicationContext.close();
	}
}
