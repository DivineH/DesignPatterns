package com.designPatterns.State;

//����
public class Context {
	//����Ϊ��̬��Ա�������ʵ��״̬����
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
	
	//��Ϊί��
	public void handle1() {
		this.currentState.handle1();
	}
	
	public void handle2() {
		this.currentState.handle2();
	}
}
