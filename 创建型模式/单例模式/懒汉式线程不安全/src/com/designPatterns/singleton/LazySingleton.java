package com.designPatterns.singleton;

public class LazySingleton {
	private LazySingleton(){}
	private static LazySingleton singleton = null;
	
	public static LazySingleton getInstance() {  
	    if (singleton == null) {  
	    	singleton = new LazySingleton();  
	    }  
	    return singleton;  
	}
	public void display(){
		System.out.print("LazySingleton");
	}
}
