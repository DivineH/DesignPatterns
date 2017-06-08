package com.designPatterns.singleton;

public class EagerSingleton {
	private EagerSingleton(){}
	private static final EagerSingleton singleton = new EagerSingleton();
	
	public static EagerSingleton getInstance() {  
	    return singleton;  
	}
	
	public void display(){
		System.out.print("EagerSingleton");
	}
}
