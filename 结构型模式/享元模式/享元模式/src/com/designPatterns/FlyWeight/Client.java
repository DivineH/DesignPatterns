package com.designPatterns.FlyWeight;

public class Client {

	public static void main(String[] args) {
		FlyWeight flyWeight1, flyWeight2;
		  
		flyWeight1 = FlyWeightFactory.getFlyWeight("extrinsicState1");
		flyWeight2 = FlyWeightFactory.getFlyWeight("extrinsicState1");
		
		//��Ԫ����̫�٣��ڶ��̻߳����У�������̲߳���ȫ���������ʹ����Ԫģʽʱ��Ӧ��֤��Ԫ���еĶ������࣬�ൽ�㹻����ҵ��Ϊֹ��
		flyWeight1.setIntrinsic("intrinsicState1");
		flyWeight1.operate();
		flyWeight2.setIntrinsic("intrinsicState2");
		flyWeight2.operate();
		flyWeight1.operate();
		
		System.out.println(flyWeight1 == flyWeight2);
	}

}
