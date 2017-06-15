package com.designPatterns.ChainOfResponsibility;

public class ConcreteHandler3 extends Handler {

	public Level getHandlerLevel(){
		return new Level(3);
	}

	@Override
	public Response echo(Request request) {
		return new Response("ConcreteHandler3");
	}
}
