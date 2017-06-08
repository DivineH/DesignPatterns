package com.designPatterns.Composite;

public class TextFile extends AbstractFile{

	TextFile(String fileName){
		this.fileName = fileName;
	}
	@Override
	public void addFile(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该方法！");
	}

	@Override
	public void removeFile(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该方法！");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("对文本文件" + fileName + "进行扫描");
	}

}
