package com.designPatterns.Iterator;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {
	private Vector vector = new Vector();
	
	@Override
	public void add(Object object) {
		vector.add(object);
	}

	@Override
	public void remove(Object object) {
		vector.remove(object);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(vector);
	}
}
