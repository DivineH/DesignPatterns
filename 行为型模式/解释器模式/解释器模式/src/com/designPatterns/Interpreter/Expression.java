package com.designPatterns.Interpreter;

//抽象表达式
public abstract class Expression {
	public abstract Object interpreter(Context context);
}
