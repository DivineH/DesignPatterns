package com.designPatterns.Interpreter;

import java.util.HashMap;

//�����࣬���ڴ洢һЩȫ����Ϣ��ͨ��������һ��HashMap��ArrayList�����͵ļ��϶���
public class Context {
	private HashMap map = new HashMap();
	
	public void assign(String key, String value) {
		//������������ֵ
		map.put(key, value);
	}
	
	public String lookup(String key) {
		//��ȡ�洢�ڻ������е�ֵ
		return (String) map.get(key);
	}
}
