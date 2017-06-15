package com.designPatterns.ChainOfResponsibility;

public class Level {
	private int level;
	public Level(int level){
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	@Override
	public boolean equals(Object obj){
		return level == ((Level)obj).getLevel();
	}
}
