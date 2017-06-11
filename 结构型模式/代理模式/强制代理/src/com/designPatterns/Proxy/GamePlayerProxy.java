package com.designPatterns.Proxy;

public class GamePlayerProxy implements IGamePlayer {
	IGamePlayer gamePlayer;
	
	public GamePlayerProxy(IGamePlayer gamePlayer) {
		// TODO Auto-generated constructor stub
		this.gamePlayer = gamePlayer;
	}
	@Override
	public void login(String account, String password) {
		// TODO Auto-generated method stub
		gamePlayer.login(account, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		gamePlayer.upgrade();
	}

	@Override
	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		//代理的代理是自己
		return this;
	}

}
