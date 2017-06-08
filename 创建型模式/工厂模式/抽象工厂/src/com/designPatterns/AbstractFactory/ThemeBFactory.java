package com.designPatterns.AbstractFactory;

public class ThemeBFactory implements ThemeFactory{
	public Button createButton(){
		Button button = new ButtonThemeB();
		return button;
	}
	public TextView createTextView(){
		TextView textView = new TextViewThemeB();
		return textView;
	}
}
