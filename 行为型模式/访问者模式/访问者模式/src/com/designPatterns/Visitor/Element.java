package com.designPatterns.Visitor;

public abstract class Element {
	//����ҵ���߼�
	public abstract void doSomething();
	//����˭������
	public abstract void accept(Visitor visitor);
}
