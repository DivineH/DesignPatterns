package com.designPatterns.FlyWeight;

//������Ԫ��ɫ
public abstract class FlyWeight {
	//�ڲ�״̬
	private String intrinsicState;
	//�ⲿ״̬
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
