import java.io.*;
import java.util.*;

public class employee {
 
	String name;
	public employee()
	{
		System.out.println("Default constuctor called");
	}
	public employee(String name)
	{
		this.name=name;
		System.out.println("Parameterized constructor called");
	}
	public employee(employee e)
	{
		System.out.println("Copy constructir called");
		this.name=e.name;
		
	}
	void dis()
	{
		System.out.println("Name:  "+name);
	}
	public static void main(String args[])
	{
		employee e=new employee();
		employee e1=new employee("Adam");
		employee e2=new employee(e1);
		e1.dis();
				
	}
}
