package com.designPatterns.FlyWeight;

public class ConcreteFlyWeight1 extends FlyWeight {

	public ConcreteFlyWeight1(String extrinsicState) {
		super(extrinsicState);
	}

	public void operate() {
		System.out.println(super.getIntrinsic());
	}
}
