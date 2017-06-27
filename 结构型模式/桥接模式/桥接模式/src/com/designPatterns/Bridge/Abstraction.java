package com.designPatterns.Bridge;

//���������Ľӿ�
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
