import java.io.*;
import java.util.*;
public class emparray {
 String name;
 int pho_no;
 int salary;
 public emparray(String name)
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
	 Scanner scan=new Scanner(System.in);
	 employee[] e=new employee[6];
	 for(int i=0;i<5;i++)
	 {
		 System.out.println("Enter name");
		 String name=scan.next();
		 e[i] = new employee(name);
		 e[i].empPhno(1000+i);
		 e[i].empSal(40000+i);
		 e[i].displayData();
	 }	 
	 
 }
}
