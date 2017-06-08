package com.designPatterns.ProtoType;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextView textView1 = new TextView();
		
		textView1.setColor("Red");
		textView1.setShape("Rectangle");
		System.out.println("textView1\nColor: " + textView1.getColor() + "\nShape: " + textView1.getShape());
		
		TextView textView2 = textView1.clone();
		System.out.println("textView2\nColor: " + textView2.getColor() + "\nShape: " + textView2.getShape());
		
		textView2.setColor("Blue");
		System.out.println("textView1\nColor: " + textView1.getColor() + "\nShape: " + textView1.getShape());
		System.out.println("textView2\nColor: " + textView2.getColor() + "\nShape: " + textView2.getShape());
		
		System.out.println(textView1 == textView2);
		System.out.println(textView1.getShape() == textView2.getShape());
		System.out.println(textView1.getColor() == textView2.getColor());
		
		TextView textView3 = null;
		try{
			textView3 = textView1.deepClone();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(textView1 == textView3);
		System.out.println(textView1.getShape() == textView3.getShape());
		System.out.println(textView1.getColor() == textView3.getColor());
	}

}
