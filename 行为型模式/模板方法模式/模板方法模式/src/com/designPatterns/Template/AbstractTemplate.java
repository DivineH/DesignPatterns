package com.designPatterns.Template;

public abstract class AbstractTemplate {
	//��������
	protected abstract void primitiveOperation1();
	protected abstract void primitiveOperation2();
	//���ӷ���
	protected boolean hookMethod(){
		return true;
	}
	//ģ�巽��
	public void templateMethod(){
		primitiveOperation1();
		if(hookMethod()){
			primitiveOperation2();
		}
	}
}
