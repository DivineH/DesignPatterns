package com.designPatterns.ChainOfResponsibility;

public abstract class Handler {
	private Handler nextHandler;
	
	public void setNextHandler(Handler handler){
		this.nextHandler = handler;
	}
	
	public final Response handleMessage(Request request){
		Response response = null;
		if(getHandlerLevel().equals(request.getRequestLevel())){
			response = echo(request);
		}else{
			if(nextHandler != null){
				response = nextHandler.handleMessage(request);
			}else{
				System.out.println("该请求没有得到处理!");
			}
		}
		return response;
	}
	
	public abstract Level getHandlerLevel();
	public abstract Response echo(Request request);
}
