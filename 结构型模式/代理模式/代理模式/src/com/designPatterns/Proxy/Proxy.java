package com.designPatterns.Proxy;

public class Proxy implements Subject {
	private Subject subject = new RealSubject();
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("Proxy : request()");
		PreRequest();
		//调用真实主题对象的方法
		subject.request();
		PostRequest();
	}

	public void PreRequest() {
		System.out.println("Proxy : PreRequest()");
	}

	public void PostRequest() {
		System.out.println("Proxy : PostRequest()");
	}
}
