package com.designPatterns.VirtualProxy;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ImageProxyTestDrive {
	
	ImageComponent imageComponent;
	JFrame frame = new JFrame("CD封面加载器");
    JMenuBar menuBar;  // 菜单栏
    JMenu menu;   	   // 菜单
	Hashtable<String, String> cds = new Hashtable();
 
	public static void main (String[] args) throws Exception {
		new ImageProxyTestDrive();
	}
 
	public ImageProxyTestDrive() throws Exception{
		cds.put("千与千寻","https://imgsa.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=10eab8e7e41190ef15f69a8daf72f673/4afbfbedab64034fed2faa0cacc379310b551ddd.jpg");
        cds.put("盗梦空间","https://imgsa.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=c86440e1ab773912d02b8d339970ed7d/d1a20cf431adcbef486e785aaeaf2edda3cc9f17.jpg");
        
        // 设置初始的CD封面
		URL initialURL = new URL(cds.get("千与千寻"));
		// 建立菜单栏
		menuBar = new JMenuBar();
		menu = new JMenu("我的CD");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

		for(Enumeration<String> e = cds.keys(); e.hasMoreElements();) {
			String name = e.nextElement();
        	JMenuItem menuItem = new JMenuItem(name);
        	menu.add(menuItem); 
        	menuItem.addActionListener(new ActionListener() {
          		  public void actionPerformed(ActionEvent event) {
          			  imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
          			  frame.repaint();
           	      }
        	});
		}

		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
	}

	URL getCDUrl(String name) {
		try {
			return new URL((String)cds.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}

