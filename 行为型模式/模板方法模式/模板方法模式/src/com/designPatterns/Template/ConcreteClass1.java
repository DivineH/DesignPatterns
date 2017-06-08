package com.designPatterns.Template;

public class ConcreteClass1 extends AbstractTemplate {
	private boolean flag;

	@Override
	protected void primitiveOperation1() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass1 : primitiveOperation1()");
	}

	@Override
	protected void primitiveOperation2() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass1 : primitiveOperation2()");
	}
	
	@Override
	public boolean hookMethod(){
		return flag;
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
}
