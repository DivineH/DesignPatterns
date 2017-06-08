package com.designPatterns.Composite;

public class TextFile extends AbstractFile{
	
	TextFile(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("对文本文件" + fileName + "进行扫描");
	}

}
