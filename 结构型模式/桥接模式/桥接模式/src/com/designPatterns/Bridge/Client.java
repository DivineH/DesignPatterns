package com.designPatterns.Bridge;

public class Client {

	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementor1();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		
		abstraction.request();
	}

}
