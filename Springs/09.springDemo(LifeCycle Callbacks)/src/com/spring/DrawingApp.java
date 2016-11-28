package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    context.registerShutdownHook();
    Triangle tr=(Triangle)context.getBean("triangle");
    tr.draw();
   
   
	}


}
