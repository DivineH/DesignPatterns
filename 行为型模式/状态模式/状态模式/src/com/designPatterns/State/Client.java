package com.designPatterns.State;

public class Client {

	public static void main(String[] args) {
		//���廷����ɫ
		Context context = new Context();
		
		context.setCurrentState(new ConcreteState1());
		context.handle1();
		context.handle2();
	}

}
