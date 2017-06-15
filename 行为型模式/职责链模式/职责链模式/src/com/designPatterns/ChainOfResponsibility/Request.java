package com.designPatterns.ChainOfResponsibility;

public class Request {
	private Level level;
	
	public void setLevel(Level level){
		this.level = level;
	}
	
	public Level getRequestLevel(){
		return level;
	}
}
