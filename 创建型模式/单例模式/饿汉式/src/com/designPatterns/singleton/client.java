package com.designPatterns.singleton;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton singleton = EagerSingleton.getInstance();
		
		if(null != singleton){
			singleton.display();
		}
	}

}