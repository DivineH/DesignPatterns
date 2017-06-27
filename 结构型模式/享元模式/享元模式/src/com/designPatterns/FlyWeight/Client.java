package com.designPatterns.FlyWeight;

public class Client {

	public static void main(String[] args) {
		FlyWeight flyWeight1, flyWeight2;
		  
		flyWeight1 = FlyWeightFactory.getFlyWeight("extrinsicState1");
		flyWeight2 = FlyWeightFactory.getFlyWeight("extrinsicState1");
		
		//享元对象太少，在多线程环境中，会出现线程不安全的情况。在使用享元模式时，应保证享元池中的对象尽量多，多到足够满足业务为止。
		flyWeight1.setIntrinsic("intrinsicState1");
		flyWeight1.operate();
		flyWeight2.setIntrinsic("intrinsicState2");
		flyWeight2.operate();
		flyWeight1.operate();
		
		System.out.println(flyWeight1 == flyWeight2);
	}

}
