package com.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String args[]){
		//Triangle tr=new Triangle();
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		Triangle tr=(Triangle)factory.getBean("triangle");
		
		tr.draw();
		
	}//end main

}
