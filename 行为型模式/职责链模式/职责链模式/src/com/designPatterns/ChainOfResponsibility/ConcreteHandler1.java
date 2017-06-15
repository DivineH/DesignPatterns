package com.designPatterns.ChainOfResponsibility;

public class ConcreteHandler1 extends Handler {

	public Level getHandlerLevel(){
		return new Level(1);
	}

	@Override
	public Response echo(Request request) {
		return new Response("ConcreteHandler1");
	}
}
