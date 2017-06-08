package com.designPatterns.Builder;

public abstract class ActorBuilder {
	protected Actor actor = new Actor();
	
	abstract public void buildActorType();
	abstract public void buildActorSex();
	abstract public void buildActorCostume();
	
	public Actor createActor(){
		return actor;
	}
}
