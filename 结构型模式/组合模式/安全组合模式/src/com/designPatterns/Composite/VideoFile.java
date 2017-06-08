package com.designPatterns.Composite;

public class VideoFile extends AbstractFile{

	VideoFile(String fileName){
		this.fileName = fileName;
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("对视频文件" + fileName + "进行扫描");
	}

}
