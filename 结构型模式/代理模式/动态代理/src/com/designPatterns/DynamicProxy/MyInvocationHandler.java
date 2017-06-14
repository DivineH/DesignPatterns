package com.designPatterns.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	//被代理对象
	private Object target;
	
	public MyInvocationHandler(Object obj){
		this.target = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return method.invoke(this.target, args);
	}

}
