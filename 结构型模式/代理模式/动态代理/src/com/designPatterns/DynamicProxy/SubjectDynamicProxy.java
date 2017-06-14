package com.designPatterns.DynamicProxy;

import java.lang.reflect.InvocationHandler;

//具体业务的动态代理
public class SubjectDynamicProxy extends DynamicProxy{
	public static <T> T newProxyInstance(Subject subject){
		ClassLoader loader = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyInvocationHandler(subject);
		
		return newProxyInstance(loader, interfaces, handler);
	}
}
