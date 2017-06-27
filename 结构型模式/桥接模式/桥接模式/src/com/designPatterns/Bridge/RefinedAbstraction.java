package com.designPatterns.Bridge;

//������󻯽�ɫ
public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}
	
	@Override
	public void request() {
		System.out.println("RefinedAbstraction : request"); 
		super.request();
		super.getImplementor().doAnything();
	}

}
