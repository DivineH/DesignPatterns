package com.designPatterns.EnumStrategy;

import java.util.Scanner;

public class Client {
	public static void main(String[] args){
		int a, b, result = 0;
		String symbol;
		
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		symbol = in.next();
		b = in.nextInt();
		
		switch (symbol) {
		case "+":
			result = Calculator.ADD.exec(a, b);
			break;
		case "-":
			result = Calculator.SUB.exec(a, b);
			break;
		}
		
		System.out.println(result);
	}
}
