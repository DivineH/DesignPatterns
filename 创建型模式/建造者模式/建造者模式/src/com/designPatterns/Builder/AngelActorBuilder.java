package com.designPatterns.Builder;

public class AngelActorBuilder extends ActorBuilder{

	@Override
	public void buildActorType() {
		// TODO Auto-generated method stub
		actor.setActorType("angel");
	}

	@Override
	public void buildActorSex() {
		// TODO Auto-generated method stub
		actor.setActorSex("female");
	}

	@Override
	public void buildActorCostume() {
		// TODO Auto-generated method stub
		actor.setActorCostume("skirt");
	}

}
