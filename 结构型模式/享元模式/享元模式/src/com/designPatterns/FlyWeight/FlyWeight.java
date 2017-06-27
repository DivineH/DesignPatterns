package com.designPatterns.FlyWeight;

//抽象享元角色
public abstract class FlyWeight {
	//内部状态
	private String intrinsicState;
	//外部状态
	protected final String extrinsicState;
	
	public FlyWeight(String extrinsicState) {
		this.extrinsicState = extrinsicState;
	}
	
	public abstract void operate();
	
	public String getIntrinsic() {
		return this.intrinsicState;
	}
	
	public void setIntrinsic(String intrinsicState) {
		this.intrinsicState = intrinsicState;
	}
}
