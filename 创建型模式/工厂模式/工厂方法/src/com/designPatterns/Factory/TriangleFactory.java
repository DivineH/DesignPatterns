package com.designPatterns.Factory;

public class TriangleFactory implements Factory{

	@Override
	public Shape createShape() {
		// TODO Auto-generated method stub
		Shape shape = new Triangle();
		return shape;
	}

}
