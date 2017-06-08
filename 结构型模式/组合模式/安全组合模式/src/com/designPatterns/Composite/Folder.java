package com.designPatterns.Composite;

import java.util.Vector;

public class Folder extends AbstractFile{
	
	private Vector<AbstractFile> fileList = new Vector<AbstractFile> ();
	
	public void addFile(AbstractFile file) {
		fileList.add(file);
	}

	public void removeFile(AbstractFile file) {
		fileList.remove(file);
	}
	
	Folder(String fileName){
		this.fileName = fileName;
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
