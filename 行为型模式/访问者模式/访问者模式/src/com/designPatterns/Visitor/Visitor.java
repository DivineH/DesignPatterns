package com.designPatterns.Visitor;

public interface Visitor {
	//可以访问哪些对象
	public void visit(ConcreteElement1 element1);
	public void visit(ConcreteElement2 element2);
}
