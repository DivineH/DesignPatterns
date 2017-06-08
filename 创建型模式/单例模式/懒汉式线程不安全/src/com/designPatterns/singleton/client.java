package com.designPatterns.singleton;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySingleton singleton = LazySingleton.getInstance();
		
		if(null != singleton){
			singleton.display();
		}
	}

}
