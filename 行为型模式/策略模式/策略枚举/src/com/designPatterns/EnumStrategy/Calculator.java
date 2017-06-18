package com.designPatterns.EnumStrategy;

public enum Calculator {
	ADD("+"){
		@Override
		public int exec(int a, int b) {
			return a + b;
		}
	},
	SUB("-"){
		@Override
		public int exec(int a, int b) {
			return a - b;
		}
	};
	
	public abstract int exec(int a, int b);
	private String value;
	private Calculator(String value){
		this.value = value;
	}
}
