package com.designPatterns.Visitor;

public class ConcreteElement2 extends Element {

	@Override
	public void doSomething() {
		System.out.println("ConcreteElement2 : doSomething");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
