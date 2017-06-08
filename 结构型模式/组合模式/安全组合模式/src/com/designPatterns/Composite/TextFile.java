package com.designPatterns.Composite;

public class TextFile extends AbstractFile{
	
	TextFile(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("���ı��ļ�" + fileName + "����ɨ��");
	}

}
