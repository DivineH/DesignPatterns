package com.designPatterns.State;

//具体状态
public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		System.out.println("ConcreteContext1 : handle1");
	}

	@Override
	public void handle2() {
		//改变当前状态为STATE2
		super.context.setCurrentState(Context.STATE2);
		super.context.handle2();
	}

}
