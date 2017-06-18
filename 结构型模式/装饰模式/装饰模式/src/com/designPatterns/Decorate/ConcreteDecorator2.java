package com.designPatterns.Decorate;

public class ConcreteDecorator2 extends Decorator {
	
	public ConcreteDecorator2(Component component) {
		super(component);
	}
	
	public void method2(){
		System.out.println("method2 –ﬁ Œ");
	}
	
	@Override
	public void operate(){
		method2();
		super.operate();
	}
}
