package com.designPatterns.Strategy;

public class Client {
	public static void main(String[] args){
		Strategy strategy = new ConcreteStrategy1();
		Context context = new Context(strategy);
		context.doSomething();
		
		context.setStrategy(new ConcreteStrategy2());
		context.doSomething();
	}
}
