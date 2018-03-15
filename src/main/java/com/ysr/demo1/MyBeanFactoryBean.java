package com.ysr.demo1;

import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactoryBean implements FactoryBean<MyBean>{

	@Override
	public MyBean getObject() throws Exception {
		// TODO Auto-generated method stub
		return new MyBean();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return MyBean.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
