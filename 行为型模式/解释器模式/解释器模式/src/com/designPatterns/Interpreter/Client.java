package com.designPatterns.Interpreter;

import java.util.Stack;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		Stack<Expression> stack = new Stack<>();
		
		for(;;) {
			//进行语法判断，并产生递归调用
		}
		
		//产生一个完整的语法树，由各个具体的语法分析进行解析
		Expression expression = stack.pop();
		//具体元素进入场景
		expression.interpreter(context);
	}

}
