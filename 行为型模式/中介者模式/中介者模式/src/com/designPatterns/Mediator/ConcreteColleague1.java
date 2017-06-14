package com.designPatterns.Mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	//���з���,�����Լ���ҵ���߼�
	public void selfMethod1(){
		System.out.println("ConcreteColleague1 : selfMethod1");
	}

	//��������,�Լ����ܴ�����߼�,�����н���������
	public void depMethod1(){
		super.mediator.doSomething1();
	}
}
