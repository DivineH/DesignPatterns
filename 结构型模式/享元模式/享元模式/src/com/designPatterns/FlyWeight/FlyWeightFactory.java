package com.designPatterns.FlyWeight;

import java.util.HashMap;

public class FlyWeightFactory {
	//³ØÈÝÆ÷
	private static HashMap<String, FlyWeight> pool = new HashMap<>();
	
	public static FlyWeight getFlyWeight(String extrinsicState) {
		FlyWeight flyWeight = null;
		
		if(pool.containsKey(extrinsicState)) {
			flyWeight = pool.get(extrinsicState);
		}else{
			flyWeight = new ConcreteFlyWeight1(extrinsicState);
			pool.put(extrinsicState, flyWeight);
		}
		
		return flyWeight;
	}
}
