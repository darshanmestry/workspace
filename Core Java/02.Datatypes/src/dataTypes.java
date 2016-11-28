/*
  Write a java code to aceept 2 integer,2 dobule and 2 String variable 
  and perform perform addition of them using '+' operator
 */
import java.util.*;
import java.io.*;
public class dataTypes {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in); 
 System.out.println("Enter Intergers");
 int i1=scan.nextInt();
 int i2=scan.nextInt();
 System.out.println("Enter doubles"); 
 double d1=scan.nextDouble();
 double d2=scan.nextDouble();
 
 System.out.println("Enter string");
 String s1=scan.nextLine();
 String s2=scan.nextLine();
 
 System.out.println(i1+i2);
 System.out.println(d1+d2);
 System.out.println(s1+s2);   
 
}	
}
