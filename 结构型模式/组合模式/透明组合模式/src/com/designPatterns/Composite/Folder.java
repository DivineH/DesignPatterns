package com.designPatterns.Composite;

import java.util.Vector;

public class Folder extends AbstractFile{
	
	private Vector<AbstractFile> fileList = new Vector<AbstractFile> ();

	Folder(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void addFile(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.add(file);
	}

	@Override
	public void removeFile(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.remove(file);
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("对文件夹" + fileName + "进行扫描");
		for(AbstractFile file : fileList) {  
            file.scan();
        }
	}

}
