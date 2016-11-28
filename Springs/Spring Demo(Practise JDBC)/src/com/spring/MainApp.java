package com.spring;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		
		System.out.println("Record creation");
		studentJDBCTemplate.create("abc", 18);
		
		System.out.println("Display records");
		List<Student>  students=studentJDBCTemplate.listStudent();
		
		for(Student records: students)
		{
			System.out.print("ID: "+records.getId() );
			System.out.print(",Name: "+records.getName());
			System.out.println(",Age:"+records.getAge());
		}
		
				

	}

}
