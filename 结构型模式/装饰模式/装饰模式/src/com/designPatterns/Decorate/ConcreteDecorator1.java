package com.designPatterns.Decorate;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
	public void method1(){
		System.out.println("method1 –ﬁ Œ");
	}
	
	@Override
	public void operate(){
		method1();
		super.operate();
	}
}
