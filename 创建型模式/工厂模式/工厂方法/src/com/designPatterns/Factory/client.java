package com.designPatterns.Factory;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape;
		Factory factory = (Factory)XMLUtil.getFactory();
		
		if(null != factory){
			shape = factory.createShape();
			System.out.println(shape.getShape());
		}
		
	}

}
