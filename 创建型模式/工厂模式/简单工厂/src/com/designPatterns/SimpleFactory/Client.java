package com.designPatterns.SimpleFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape;
		String shapeType = XMLUtil.getShapeType();
		
		shape = ShapeFactory.createShape(shapeType);
		
		if(null != shape){
			System.out.println(shape.getShape());
		}
	}

}
