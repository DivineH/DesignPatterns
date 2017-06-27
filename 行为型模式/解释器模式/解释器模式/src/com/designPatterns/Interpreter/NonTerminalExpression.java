package com.designPatterns.Interpreter;

//���ս�����ʽ
public class NonTerminalExpression extends Expression {
	private Expression leftExpression;
	private Expression rightExpression;
	
	public NonTerminalExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	@Override
	public Object interpreter(Context context) {
		//�ݹ����ÿһ����ɲ��ֵ�interpret()����
		//�ڵݹ����ʱָ����ɲ��ֵ����ӷ�ʽ�������ս���Ĺ���
		return null;
	}
	
}
