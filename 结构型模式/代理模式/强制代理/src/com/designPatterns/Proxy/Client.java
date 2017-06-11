package com.designPatterns.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//直接访问真实角色，并不能登录、打怪、升级
		IGamePlayer gamePlayer = new GamePlayer("小明");
		gamePlayer.login("xiaoming", "password");
		gamePlayer.killBoss();
		gamePlayer.upgrade();
		System.out.println("*********************************");
		//直接访问代理类，也不能登录、打怪、升级
		IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
		proxy.login("xiaoming", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("*********************************");
		//必须通过真实角色查找到自己的代理角色，才能登录、打怪、升级
		proxy = gamePlayer.getProxy();
		proxy.login("xiaoming", "password");
		proxy.killBoss();
		proxy.upgrade();
	}

}
