package com.designPatterns.Memento;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.setState1("�̳�");
		originator.setState2("��װ");
		originator.setState3("��̬");
		System.out.println("��ʼ��״̬ : \n" + originator);
		
		//��������¼
		caretaker.setMemento(originator.createMemento());
		
		//�޸�״ֵ̬
		originator.setState1("Hello");
		originator.setState2("World");
		originator.setState3("Java");
		System.out.println("�޸ĺ�״̬ : \n" + originator);
		
		//�ָ�����¼
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("�ָ���״̬ : \n" + originator);
	}

}
