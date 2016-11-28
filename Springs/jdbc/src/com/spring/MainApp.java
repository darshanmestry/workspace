package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String args[])
 {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
	System.out.println("Record created...");
	studentJDBCTemplate.create("dm11", 22);
	System.out.println("Display records");
	List<Student> students=studentJDBCTemplate.listStudent();
	for(Student record: students)
	{
		System.out.print("ID: "+record.getId());
		System.out.print(",Name: "+record.getName() );
		System.out.println(",Age: "+record.getAge());
	}
	
	
	
	
 }
}
