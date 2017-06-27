package com.designPatterns.Interpreter;

import java.util.HashMap;

//环境类，用于存储一些全局信息，通常包含了一个HashMap或ArrayList等类型的集合对象。
public class Context {
	private HashMap map = new HashMap();
	
	public void assign(String key, String value) {
		//往环境类中设值
		map.put(key, value);
	}
	
	public String lookup(String key) {
		//获取存储在环境类中的值
		return (String) map.get(key);
	}
}
