package com.designPatterns.Decorate;

//³éÏó×°ÊÎÕß
public abstract class Decorator extends Component {
	private Component component;
	
	public Decorator(Component component){
		this.component = component;
	}
	
	@Override
	public void operate(){
		component.operate();
	}
}
