package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
   // Shape  shape=(Shape)context.getBean("triangle");
    Shape  shape=(Shape)context.getBean("circle");
    shape.draw();
   
   
	}


}
