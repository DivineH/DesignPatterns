package com.designPatterns.Factory;

public class CircleFactory implements Factory{

	@Override
	public Shape createShape() {
		// TODO Auto-generated method stub
		Shape shape = new Circle();
		return shape;
	}

}
