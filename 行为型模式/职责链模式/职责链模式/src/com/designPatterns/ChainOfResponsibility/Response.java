package com.designPatterns.ChainOfResponsibility;

public class Response {
	private String msg;
	
	public Response(String msg){
		this.msg = msg;
	}
	
	public String getMsg(){
		return msg;
	}
}
