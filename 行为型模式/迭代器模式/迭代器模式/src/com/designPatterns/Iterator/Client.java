package com.designPatterns.Iterator;

public class Client {
	public static void main(String[] args){
		Aggregate aggregate = new ConcreteAggregate();
		aggregate.add("123");
		aggregate.add("abc");
		aggregate.add("aaa");
		Iterator iterator = aggregate.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
