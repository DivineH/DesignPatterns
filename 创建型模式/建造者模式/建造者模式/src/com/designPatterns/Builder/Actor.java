package com.designPatterns.Builder;

public class Actor {
	private String actorType;
	private String actorSex;
	private String actorCostume;
	
	public String getActorType() {
		return actorType;
	}
	public void setActorType(String actorType) {
		this.actorType = actorType;
	}
	public String getActorSex() {
		return actorSex;
	}
	public void setActorSex(String actorSex) {
		this.actorSex = actorSex;
	}
	public String getActorCostume() {
		return actorCostume;
	}
	public void setActorCostume(String actorCostume) {
		this.actorCostume = actorCostume;
	}
}
