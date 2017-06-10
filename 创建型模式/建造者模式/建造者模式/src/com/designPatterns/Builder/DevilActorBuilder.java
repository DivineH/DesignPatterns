package com.designPatterns.Builder;

public class DevilActorBuilder extends ActorBuilder{

	@Override
	public void buildActorType() {
		// TODO Auto-generated method stub
		actor.setActorType("devil");
	}

	@Override
	public void buildActorSex() {
		// TODO Auto-generated method stub
		actor.setActorSex("male");
	}

	@Override
	public void buildActorCostume() {
		// TODO Auto-generated method stub
		actor.setActorCostume("armour");
	}

}
