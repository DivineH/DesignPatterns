package com.designPatterns.Memento;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.setState1("继承");
		originator.setState2("封装");
		originator.setState3("多态");
		System.out.println("初始化状态 : \n" + originator);
		
		//创建备忘录
		caretaker.setMemento(originator.createMemento());
		
		//修改状态值
		originator.setState1("Hello");
		originator.setState2("World");
		originator.setState3("Java");
		System.out.println("修改后状态 : \n" + originator);
		
		//恢复备忘录
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复后状态 : \n" + originator);
	}

}
