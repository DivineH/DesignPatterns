package com.designPatterns.ProtoType;

import java.io.*;

//Java语言提供的Cloneable接口和Serializable接口的代码非常简单，它们都是空接口，这种空接口也称为标识接口，标识接口中没有任何方法的定义，其作用是告诉JRE这些接口的实现类是否具有某个功能，如是否支持克隆、是否支持序列化等。
public class TextView implements Cloneable, Serializable{
	private String shape;
	private String color;
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//浅克隆
	public TextView clone(){
		Object obj = null;
		
		try{
			obj = super.clone();
			return (TextView)obj;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//深克隆
	public TextView deepClone()throws  IOException, ClassNotFoundException{
		//将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
       
        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (TextView)ois.readObject();
	}
}
