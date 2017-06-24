package com.designPatterns.Visitor;

import java.util.Random;

//对象结构，是一个元素的集合，它用于存放元素对象，并且提供了遍历其内部元素的方法。
public class ObjectStructure {
	public static Element createElement(){
		Random random = new Random();
		
		if(random.nextInt(100) > 50){
			return new ConcreteElement1();
		}
		return new ConcreteElement2();
	}
}
