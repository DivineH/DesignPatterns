package com.designPatterns.Bridge;

public class ConcreteImplementor1 implements Implementor {

	@Override
	public void doSomething() {
		System.out.println("ConcreteImplementor1 : doSomething");
	}

	@Override
	public void doAnything() {
		System.out.println("ConcreteImplementor1 : doAnything");
	}

}
