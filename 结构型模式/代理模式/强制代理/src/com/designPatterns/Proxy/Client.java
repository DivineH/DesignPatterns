package com.designPatterns.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ֱ�ӷ�����ʵ��ɫ�������ܵ�¼����֡�����
		IGamePlayer gamePlayer = new GamePlayer("С��");
		gamePlayer.login("xiaoming", "password");
		gamePlayer.killBoss();
		gamePlayer.upgrade();
		System.out.println("*********************************");
		//ֱ�ӷ��ʴ����࣬Ҳ���ܵ�¼����֡�����
		IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
		proxy.login("xiaoming", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("*********************************");
		//����ͨ����ʵ��ɫ���ҵ��Լ��Ĵ����ɫ�����ܵ�¼����֡�����
		proxy = gamePlayer.getProxy();
		proxy.login("xiaoming", "password");
		proxy.killBoss();
		proxy.upgrade();
	}

}
