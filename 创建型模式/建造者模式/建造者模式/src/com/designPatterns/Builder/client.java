package com.designPatterns.Builder;

public class client {
	public static void main(String[] args){
		Actor actor = null;
		ActorBuilder actorBuilder = (ActorBuilder)XMLUtil.getActorBuilder();
		ActorController actorController = new ActorController();
		
		actor = actorController.constructActor(actorBuilder);
		System.out.println(actor.getActorType() + " " + actor.getActorSex() + " " + actor.getActorCostume());
	}
}
