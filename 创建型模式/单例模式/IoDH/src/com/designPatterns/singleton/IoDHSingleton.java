package com.designPatterns.singleton;

//通过IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的单例模式实现方式
//（其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）

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
