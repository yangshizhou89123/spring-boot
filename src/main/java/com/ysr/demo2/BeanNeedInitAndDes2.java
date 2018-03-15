package com.ysr.demo2;

public class BeanNeedInitAndDes2 {
	public BeanNeedInitAndDes2() {
		System.out.println("BeanNeedInitAndDes2构造函数");
	}
	
	public void init(){
		System.out.println("BeanNeedInitAndDes2初始化");
	}
	
	public void des(){
		System.out.println("BeanNeedInitAndDes2销毁");
	}
}
