package com.designPatterns.Decorate;

//需要被装饰的构件
public class ConcreteComponent extends Component {
	@Override
	public void operate(){
		System.out.println("do something.");
	}
}
