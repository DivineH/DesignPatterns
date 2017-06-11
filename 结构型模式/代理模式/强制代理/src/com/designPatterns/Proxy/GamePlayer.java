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
			System.out.println(account + "��¼�ɹ�");
		}else{
			System.out.println("��ʹ��ָ���Ĵ������");
		}
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		if(isProxy()){
			System.out.println(name + "�ڴ��");
		}else{
			System.out.println("��ʹ��ָ���Ĵ������");
		}
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		if(isProxy()){
			System.out.println(name + "����");
		}else{
			System.out.println("��ʹ��ָ���Ĵ������");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		proxy = new GamePlayerProxy(this);
		return proxy;
	}
	
	//�Ƿ�Ϊ�������
	private boolean isProxy(){
		if(proxy == null)
			return false;
		return true;
	}

}
