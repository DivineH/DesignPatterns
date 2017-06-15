package com.designPatterns.ChainOfResponsibility;

public class Client {
	public static void main(String[] args){
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		Request request = new Request();
		Response response = new Response(null);
		
		request.setLevel(new Level(1));
		response = handler1.handleMessage(request);
		System.out.println(response.getMsg());
		
		request.setLevel(new Level(2));
		response = handler1.handleMessage(request);
		System.out.println(response.getMsg());
		
		request.setLevel(new Level(3));
		response = handler1.handleMessage(request);
		System.out.println(response.getMsg());
		
		request.setLevel(new Level(4));
		handler1.handleMessage(request);
	}
}
