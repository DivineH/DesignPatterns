package com.designPatterns.AbstractFactory;

public class ThemeAFactory implements ThemeFactory{
	public Button createButton(){
		Button button = new ButtonThemeA();
		return button;
	}
	public TextView createTextView(){
		TextView textView = new TextViewThemeA();
		return textView;
	}
}
