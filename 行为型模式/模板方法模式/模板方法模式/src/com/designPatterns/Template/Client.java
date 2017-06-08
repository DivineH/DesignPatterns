package com.designPatterns.Template;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteClass1 c1 = new ConcreteClass1();
		c1.setFlag(true);
		c1.templateMethod();
		
		ConcreteClass2 c2 = new ConcreteClass2();
		c2.templateMethod();
	}

}
