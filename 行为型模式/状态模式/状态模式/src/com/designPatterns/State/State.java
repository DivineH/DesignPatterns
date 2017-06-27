package com.designPatterns.State;

//����״̬
public abstract class State {
	protected Context context;
	
	//���û���
	public void setContext(Context context) {
		this.context = context;
	}
	//��Ϊ1
	public abstract void handle1();
	//��Ϊ2
	public abstract void handle2();
}
