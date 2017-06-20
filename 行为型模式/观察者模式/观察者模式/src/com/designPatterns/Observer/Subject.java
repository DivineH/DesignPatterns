package com.designPatterns.Observer;

import java.util.ArrayList;

public abstract class Subject {
	private ArrayList<Observer> observerList = new ArrayList<>();
	
	public void addObserver(Observer observer){
		observerList.add(observer);
	}
	
	public void deleteObserver(Observer observer){
		observerList.remove(observer);
	}
	
	public void notifyObservers(){
		for(Observer observer : observerList){
			observer.update();
		}
	}
}
