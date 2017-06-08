package com.designPatterns.Composite;

public class ImageFile extends AbstractFile{

	ImageFile(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("对图像文件" + fileName + "进行扫描");
	}

}
