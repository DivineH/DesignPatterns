package com.designPatterns.Mediator;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		colleague1.selfMethod1();
		colleague2.selfMethod2();
		
		colleague1.depMethod1();
		colleague2.depMethod2();
	}

}
