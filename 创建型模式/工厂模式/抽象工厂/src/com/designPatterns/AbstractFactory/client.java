package com.designPatterns.AbstractFactory;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThemeFactory factory;
		Button button;
		TextView textView;
		
		factory = (ThemeFactory)XMLUtil.getThemeFactory();
		
		if(null != factory){
			button = factory.createButton();
			textView = factory.createTextView();
			
			button.display();
			textView.display();
		}
	}

}
