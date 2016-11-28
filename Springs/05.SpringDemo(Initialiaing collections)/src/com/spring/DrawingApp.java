package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    Triangle tr=(Triangle)context.getBean("triangle");
    tr.draw();
   
   
	}


}
