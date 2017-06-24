package com.designPatterns.Memento;

//Ô­·¢Æ÷
public class Originator {
	private String state;

    public Memento createMemento() {
    	return new Memento(this);
    }

    public void restoreMemento(Memento memento) {
    	state = memento.getState();
    }

    public void setState(String state) {
        this.state=state;
    }

    public String getState() {
        return this.state;
    }
}
