package com.designPatterns.Mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	//自有方法,处理自己的业务逻辑
	public void selfMethod2(){
		System.out.println("ConcreteColleague2 : selfMethod2");
	}

	//依赖方法,自己不能处理的逻辑,交给中介者来处理
	public void depMethod2(){
		super.mediator.doSomething2();
	}
}
