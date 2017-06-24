package com.designPatterns.Memento;

//±¸ÍüÂ¼
public class Memento {
	private String state;
	
	public Memento(Originator originator){
		state = originator.getState();
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
}
