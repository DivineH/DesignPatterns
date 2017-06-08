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
		actor.setActorType("male");
	}

	@Override
	public void buildActorCostume() {
		// TODO Auto-generated method stub
		actor.setActorType("armour");
	}

}
