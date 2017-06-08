package com.designPatterns.singleton;

public class LazySingleton {
	private LazySingleton(){}
	private static volatile LazySingleton singleton = null;
	
	public static LazySingleton getInstance() {  
		//第一重判断
        if (singleton == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (singleton == null) {
                	singleton = new LazySingleton(); //创建单例实例
                }
            }
        }
	    return singleton;  
	}
	
	public void display(){
		System.out.print("LazySingleton");
	}
}
