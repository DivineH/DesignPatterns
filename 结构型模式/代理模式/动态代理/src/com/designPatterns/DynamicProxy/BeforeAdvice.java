package com.designPatterns.DynamicProxy;

public class BeforeAdvice implements Advice {

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("我是前置通知。");
	}

}
