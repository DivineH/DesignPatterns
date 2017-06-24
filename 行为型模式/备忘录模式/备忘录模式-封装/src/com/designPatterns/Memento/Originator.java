package com.designPatterns.Memento;

//ԭ����
public class Originator {
	private String state;
	//�ڲ���
	private class ConcreteMemento implements Memento {
		private String state;
		
		private ConcreteMemento(String state) {
			this.state = state;
		}
		
		private String getState(){
			return this.state;
		}
	}

    public Memento createMemento() {
    	return new ConcreteMemento(this.state);
    }

    public void restoreMemento(Memento memento) {
    	setState(((ConcreteMemento)memento).getState());
    }

    public void setState(String state) {
        this.state=state;
    }

    public String getState() {
        return this.state;
    }
}
