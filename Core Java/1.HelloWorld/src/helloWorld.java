/*
 Task 
To complete this , you must save a line of input from stdin to a variable, 
print the value of your variable on a second line.

SAMPLE INPUT:Welcome to 30 Days of Code!

SAMPLE OUTPUT:Welcome to 30 Days of Code!
 */
import java.io.*;
import java.util.*;
public class helloWorld {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(str);
	}

}
