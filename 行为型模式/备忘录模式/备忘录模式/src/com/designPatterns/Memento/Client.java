package com.designPatterns.Memento;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("״̬1");
		System.out.println(originator.getState());
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.setState("״̬2");
		System.out.println(originator.getState());
		System.out.print("�ָ�֮��״̬: ");
		originator.restoreMemento(caretaker.getMemento());
		System.out.println(originator.getState());
	}

}
