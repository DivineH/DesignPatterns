package com.designPatterns.Composite;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;  
        
        folder1 = new Folder("我的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");
          
        file1 = new ImageFile("JPG.jpg");
        file2 = new ImageFile("GIF.gif");
        file3 = new TextFile("TXT.txt");
        file4 = new TextFile("DOC.doc");
        file5 = new VideoFile("RMVB.rmvb");
        
        folder2.addFile(file1);
        folder2.addFile(file2);
        folder3.addFile(file3);
        folder3.addFile(file4);
        folder4.addFile(file5);
        folder1.addFile(folder2);
        folder1.addFile(folder3);
        folder1.addFile(folder4);
        
        folder1.scan();  
	}

}
