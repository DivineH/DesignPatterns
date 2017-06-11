package com.designPatterns.Proxy;

public class GamePlayer implements IGamePlayer {
	private String name;
	private IGamePlayer proxy;
	
	public GamePlayer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void login(String account, String password) {
		// TODO Auto-generated method stub
		if(isProxy()){
			System.out.println(account + "登录成功");
		}else{
			System.out.println("请使用指定的代理访问");
		}
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		if(isProxy()){
			System.out.println(name + "在打怪");
		}else{
			System.out.println("请使用指定的代理访问");
		}
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		if(isProxy()){
			System.out.println(name + "升级");
		}else{
			System.out.println("请使用指定的代理访问");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		proxy = new GamePlayerProxy(this);
		return proxy;
	}
	
	//是否为代理访问
	private boolean isProxy(){
		if(proxy == null)
			return false;
		return true;
	}

}
