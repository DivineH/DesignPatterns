package com.designPatterns.Composite;

public class VideoFile extends AbstractFile{

	VideoFile(String fileName){
		this.fileName = fileName;
	}
	@Override
	public void addFile(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("�Բ��𣬲�֧�ָ÷�����");
	}

	@Override
	public void removeFile(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("�Բ��𣬲�֧�ָ÷�����");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("����Ƶ�ļ�" + fileName + "����ɨ��");
	}

}