/*
 TASK:
 Given an array,A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 
 IMPUT FORMAT:
 First line contains size of array
 Second line contains n spaced seperated integers describing array elements
  
 SAMPLE INPUT:
 4
 1 4 3 2
 
 SAMPLE OUTPUT:
 2 3 4 1
 
 */
import java.io.*;
import java.util.*;
public class arrays {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	
	int size=scan.nextInt();
	int [] a=new int[size];
	
	for(int i=0;i<size;i++)
	{
		a[i]=scan.nextInt();
	}	
	System.out.println("");
	for(int i=size-1;i>=0;i--)
	{
		System.out.print(a[i]+"   ");
	}	
}

}
