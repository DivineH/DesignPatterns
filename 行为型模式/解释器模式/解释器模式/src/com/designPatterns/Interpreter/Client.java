package com.designPatterns.Interpreter;

import java.util.Stack;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		Stack<Expression> stack = new Stack<>();
		
		for(;;) {
			//�����﷨�жϣ��������ݹ����
		}
		
		//����һ���������﷨�����ɸ���������﷨�������н���
		Expression expression = stack.pop();
		//����Ԫ�ؽ��볡��
		expression.interpreter(context);
	}

}
