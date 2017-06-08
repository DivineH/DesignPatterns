package com.designPatterns.SimpleFactory;

import javax.xml.parsers.*;  
import org.w3c.dom.*;  
import java.io.*;  

public class XMLUtil {
	public static String getShapeType(){
		try {  
            //�����ĵ�����  
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();  
            Document doc;                             
            doc = docBuilder.parse(new File("config.xml"));   
          
            //��ȡ����shapeType���͵��ı��ڵ�  
            NodeList nl = doc.getElementsByTagName("shapeType");  
            Node classNode = nl.item(0).getFirstChild();  
            String shapeType = classNode.getNodeValue().trim();  
            return shapeType;
        }     
        catch(Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
	}
}
