package com.designPatterns.singleton;

public class LazySingleton {
	private LazySingleton(){}
	private static volatile LazySingleton singleton = null;
	
	public static LazySingleton getInstance() {  
		//��һ���ж�
        if (singleton == null) {
            //���������
            synchronized (LazySingleton.class) {
                //�ڶ����ж�
                if (singleton == null) {
                	singleton = new LazySingleton(); //��������ʵ��
                }
            }
        }
	    return singleton;  
	}
	
	public void display(){
		System.out.print("LazySingleton");
	}
}
