package com.designPatterns.Adapter;

public class Adapter extends Adaptee implements Target {
	@Override
	public void request() {
		super.doSomething();
	}
}
