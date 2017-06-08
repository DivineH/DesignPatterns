package com.designPatterns.singleton;

public class LazySingleton {
	private LazySingleton(){}
	private static LazySingleton singleton = null;
	
	//系统性能大大降低
	synchronized public static LazySingleton getInstance1() {  
	    if (singleton == null) {  
	    	singleton = new LazySingleton();  
	    }  
	    return singleton;  
	}
	
	//为提高系能,可用下述方法,但单例对象可能不唯一,可加双重检查锁定
	public static LazySingleton getInstance2() {  
	    if (singleton == null) {
	    	synchronized (LazySingleton.class){
	    		singleton = new LazySingleton();  
	    	}
	    }  
	    return singleton;  
	}
	
	public void display(){
		System.out.print("LazySingleton");
	}
}
