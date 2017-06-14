package com.designPatterns.Mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	//���з���,�����Լ���ҵ���߼�
	public void selfMethod2(){
		System.out.println("ConcreteColleague2 : selfMethod2");
	}

	//��������,�Լ����ܴ�����߼�,�����н���������
	public void depMethod2(){
		super.mediator.doSomething2();
	}
}
