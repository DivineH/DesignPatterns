package com.designPatterns.Builder;

//导演类
public class ActorController {
	public Actor constructActor(ActorBuilder actorBuilder){
		
		actorBuilder.buildActorType();
		actorBuilder.buildActorSex();
		actorBuilder.buildActorCostume();
		
		return actorBuilder.createActor();
	}
}
