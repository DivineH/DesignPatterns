package com.designPatterns.singleton;

public class LazySingleton {
	private LazySingleton(){}
	private static LazySingleton singleton = null;
	
	//ϵͳ���ܴ�󽵵�
	synchronized public static LazySingleton getInstance1() {  
	    if (singleton == null) {  
	    	singleton = new LazySingleton();  
	    }  
	    return singleton;  
	}
	
	//Ϊ���ϵ��,������������,������������ܲ�Ψһ,�ɼ�˫�ؼ������
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
