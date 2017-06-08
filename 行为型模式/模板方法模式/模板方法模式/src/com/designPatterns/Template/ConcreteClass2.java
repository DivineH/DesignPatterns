package com.designPatterns.Template;

public class ConcreteClass2 extends AbstractTemplate {

	@Override
	protected void primitiveOperation1() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass2 : primitiveOperation1()");
	}

	@Override
	protected void primitiveOperation2() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass2 : primitiveOperation2()");
	}

	@Override
	public boolean hookMethod(){
		return false;
	}
}
