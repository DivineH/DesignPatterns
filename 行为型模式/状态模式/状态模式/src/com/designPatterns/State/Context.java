package com.designPatterns.State;

//环境
public class Context {
	//定义为静态成员对象可以实现状态共享
	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();
	
	private State currentState;
	
	public State getState() {
		return this.currentState;
	}
	
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		this.currentState.setContext(this);
	}
	
	//行为委托
	public void handle1() {
		this.currentState.handle1();
	}
	
	public void handle2() {
		this.currentState.handle2();
	}
}
