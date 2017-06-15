package com.designPatterns.ChainOfResponsibility;

public class ConcreteHandler2 extends Handler {

	public Level getHandlerLevel(){
		return new Level(2);
	}

	@Override
	public Response echo(Request request) {
		return new Response("ConcreteHandler2");
	}
}
