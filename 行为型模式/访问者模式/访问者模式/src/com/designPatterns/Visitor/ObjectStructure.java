package com.designPatterns.Visitor;

import java.util.Random;

//����ṹ����һ��Ԫ�صļ��ϣ������ڴ��Ԫ�ض��󣬲����ṩ�˱������ڲ�Ԫ�صķ�����
public class ObjectStructure {
	public static Element createElement(){
		Random random = new Random();
		
		if(random.nextInt(100) > 50){
			return new ConcreteElement1();
		}
		return new ConcreteElement2();
	}
}
