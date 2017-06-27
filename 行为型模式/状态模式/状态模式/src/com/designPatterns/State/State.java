package com.designPatterns.State;

//抽象状态
public abstract class State {
	protected Context context;
	
	//设置环境
	public void setContext(Context context) {
		this.context = context;
	}
	//行为1
	public abstract void handle1();
	//行为2
	public abstract void handle2();
}
