package com.designPatterns.Template;

public abstract class AbstractTemplate {
	//基本方法
	protected abstract void primitiveOperation1();
	protected abstract void primitiveOperation2();
	//钩子方法
	protected boolean hookMethod(){
		return true;
	}
	//模板方法
	public void templateMethod(){
		primitiveOperation1();
		if(hookMethod()){
			primitiveOperation2();
		}
	}
}
