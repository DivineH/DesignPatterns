package com.designPatterns.Mediator;

public class ConcreteMediator extends Mediator {

	@Override
	public void doSomething1() {
		System.out.println("ConcreteMediator : doSomething1");
		colleague1.selfMethod1();
		colleague2.selfMethod2();
	}

	@Override
	public void doSomething2() {
		System.out.println("ConcreteMediator : doSomething2");
		colleague1.selfMethod1();
		colleague2.selfMethod2();
	}

}
