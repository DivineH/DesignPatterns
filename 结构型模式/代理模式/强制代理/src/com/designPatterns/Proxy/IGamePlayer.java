package com.designPatterns.Proxy;

public interface IGamePlayer {
	public void login(String account, String password);
	public void killBoss();
	public void upgrade();
	public IGamePlayer getProxy();
}
