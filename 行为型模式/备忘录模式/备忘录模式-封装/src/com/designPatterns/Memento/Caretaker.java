package com.designPatterns.Memento;

public class Caretaker {
	private Memento memento;
	
	public Memento getMemento(){
		return this.memento;
	}
	
	public void setMemento(Memento memento){
		this.memento = memento;
	}
}
