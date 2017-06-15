package com.designPatterns.Command;

public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		invoker.setCommand(new ConcreteCommand1());
		invoker.action();
	}
}
