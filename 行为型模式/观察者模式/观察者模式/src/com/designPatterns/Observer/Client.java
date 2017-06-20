package com.designPatterns.Observer;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver observer = new ConcreteObserver();
		
		subject.addObserver(observer);
		subject.doSomething();
	}

}
