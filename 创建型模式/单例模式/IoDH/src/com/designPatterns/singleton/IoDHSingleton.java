package com.designPatterns.singleton;

//ͨ��IoDH�����Ǽȿ���ʵ���ӳټ��أ��ֿ��Ա�֤�̰߳�ȫ����Ӱ��ϵͳ���ܣ���ʧΪһ����õĵ���ģʽʵ�ַ�ʽ
//����ȱ�����������Ա����������أ��ܶ�����������Բ�֧��IoDH��

public class IoDHSingleton {
	private IoDHSingleton() {}  
      
    private static class HolderClass {  
            private final static IoDHSingleton singleton = new IoDHSingleton();  
    }  
      
    public static IoDHSingleton getInstance() {  
        return HolderClass.singleton;  
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IoDHSingleton s1, s2;
		
        s1 = IoDHSingleton.getInstance();
        s2 = IoDHSingleton.getInstance();
        
        System.out.println(s1==s2);  
	}

}
