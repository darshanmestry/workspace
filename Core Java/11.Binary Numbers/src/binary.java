/*
 * Write a java code to convert a decimal no in to binary no and find out maximun no of ones.
 */
import java.io.*;
import java.util.*;
public class binary {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no");
		int j=0;;
        int n=scan.nextInt();
        int [] arr=new int[20];
        int count=0;
        while(n>0)
        {
        	int rem=n%2;
        	n=n/2;
        	arr[j]=rem;
        	j++;
        }//end while
	
       for(int i=0;i<j;i++)
       {
    	   System.out.print(arr[i]+ " ");
    	   if(arr[i]==1)
    		   count++;
    		   
       }
       
       System.out.println("");
       System.out.println("max no of ones:"+count);
	}//end main

}
