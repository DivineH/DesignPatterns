package com.designPatterns.DynamicProxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("do something!");
	}

}
