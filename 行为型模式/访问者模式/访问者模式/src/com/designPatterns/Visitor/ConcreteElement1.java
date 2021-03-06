package com.designPatterns.Visitor;

public class ConcreteElement1 extends Element {

	@Override
	public void doSomething() {
		System.out.println("ConcreteElement1 : doSomething");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
