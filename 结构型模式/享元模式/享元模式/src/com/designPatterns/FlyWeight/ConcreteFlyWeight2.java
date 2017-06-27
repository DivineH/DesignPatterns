package com.designPatterns.FlyWeight;

public class ConcreteFlyWeight2 extends FlyWeight {

	public ConcreteFlyWeight2(String extrinsicState) {
		super(extrinsicState);
	}
	
	public void operate() {
		System.out.println(super.getIntrinsic());
	}
}
