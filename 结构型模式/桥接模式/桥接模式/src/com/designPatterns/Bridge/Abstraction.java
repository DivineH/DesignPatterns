package com.designPatterns.Bridge;

//定义抽象类的接口
public abstract class Abstraction {
	Implementor implementor;
	
	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void request() {
		this.implementor.doSomething();
	}
	
	public Implementor getImplementor() {
		return this.implementor;
	}
}
