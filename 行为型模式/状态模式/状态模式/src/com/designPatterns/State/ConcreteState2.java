package com.designPatterns.State;

//����״̬
public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		//�ı䵱ǰ״̬ΪSTATE1
		super.context.setCurrentState(Context.STATE1);
		super.context.handle1();
	}

	@Override
	public void handle2() {
		System.out.println("ConcreteContext2 : handle2");
	}

}
