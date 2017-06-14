package com.designPatterns.Mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	//自有方法,处理自己的业务逻辑
	public void selfMethod1(){
		System.out.println("ConcreteColleague1 : selfMethod1");
	}

	//依赖方法,自己不能处理的逻辑,交给中介者来处理
	public void depMethod1(){
		super.mediator.doSomething1();
	}
}
