package com.designPatterns.Builder;

public class ActorController {
	public Actor constructActor(ActorBuilder actorBuilder){
		
		actorBuilder.buildActorType();
		actorBuilder.buildActorSex();
		actorBuilder.buildActorCostume();
		
		return actorBuilder.createActor();
	}
}
