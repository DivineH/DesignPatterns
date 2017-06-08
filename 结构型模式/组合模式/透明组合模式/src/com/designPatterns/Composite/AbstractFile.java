package com.designPatterns.Composite;

abstract class AbstractFile {
	protected String fileName;
	public abstract void addFile(AbstractFile file);  
    public abstract void removeFile(AbstractFile file);  
    public abstract void scan();
}
