package com.ysr.demo2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanNeedInit implements InitializingBean,DisposableBean{

	public BeanNeedInit() {
		System.out.println("构造函数");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("销毁");
	}
	
}
