package com.designPatterns.Adapter;

public class ConcreteTarget implements Target {
	@Override
	public void request() {
		System.out.println("ConcreteTarget : request");
	}
}
