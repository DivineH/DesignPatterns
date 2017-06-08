package com.designPatterns.ProtoType;

import java.io.*;

//Java�����ṩ��Cloneable�ӿں�Serializable�ӿڵĴ���ǳ��򵥣����Ƕ��ǿսӿڣ����ֿսӿ�Ҳ��Ϊ��ʶ�ӿڣ���ʶ�ӿ���û���κη����Ķ��壬�������Ǹ���JRE��Щ�ӿڵ�ʵ�����Ƿ����ĳ�����ܣ����Ƿ�֧�ֿ�¡���Ƿ�֧�����л��ȡ�
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
	
	//ǳ��¡
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
	//���¡
	public TextView deepClone()throws  IOException, ClassNotFoundException{
		//������д������
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
       
        //�����������ȡ��
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (TextView)ois.readObject();
	}
}
