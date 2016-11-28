import java.io.*;
import java.util.*;
public class employee {
 String name;
 int pho_no;
 int salary;
 public employee(String name)
 {
	 this.name=name;
 }
 public void empSal(int sal)
 {
	 this.salary=sal;
 }
 public void empPhno(int pho_no)
 {
	 this.pho_no=pho_no;
 }
 
 void displayData(){
	 System.out.println("Name  : "+name);
	 System.out.println("Phno  : "+pho_no);
	 System.out.println("Salary: "+salary);
 }
 public static void main(String args[])
 {
	 employee e=new employee("Adam");
	 
	 e.empPhno(1000);
	 e.empSal(40000);
	 e.displayData();
 }
}
