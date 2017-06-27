package com.designPatterns.Interpreter;

//非终结符表达式
public class NonTerminalExpression extends Expression {
	private Expression leftExpression;
	private Expression rightExpression;
	
	public NonTerminalExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	@Override
	public Object interpreter(Context context) {
		//递归调用每一个组成部分的interpret()方法
		//在递归调用时指定组成部分的连接方式，即非终结符的功能
		return null;
	}
	
}
