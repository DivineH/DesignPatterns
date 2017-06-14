package com.designPatterns.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
		if(true){
			//执行前置通知
			(new BeforeAdvice()).exec();
		}
		return (T)Proxy.newProxyInstance(loader, interfaces, h);
	}
}
