package com.designPatterns.SimpleFactory;

public class ShapeFactory {
	public static Shape createShape(String arg){
		Shape shape = null;
		
		if (arg.equalsIgnoreCase("Circle")) {  
			shape = new Circle();  
        }else if (arg.equalsIgnoreCase("Triangle")) {  
        	shape = new Triangle();  
        }else{
        	System.out.println("不存在" + arg + "类型。");
        }
        return shape; 
	}
}
