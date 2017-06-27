package com.designPatterns.State;

//具体状态
public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		//改变当前状态为STATE1
		super.context.setCurrentState(Context.STATE1);
		super.context.handle1();
	}

	@Override
	public void handle2() {
		System.out.println("ConcreteContext2 : handle2");
	}

}
