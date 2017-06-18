package com.designPatterns.Strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void doSomething(){
		strategy.doSomthing();
	}
}
