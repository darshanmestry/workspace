/*
 Given an integer,n , print its first 10 multiples. Each multiple n x i (where1<i<10 ) should be printed on a new 
 line in the form: n x i = result.
 
 SAMPLE INPUT:
 2
 
 SAMPLE OUTPUT
 2 x 1 = 2
 2 x 2 = 4
 2 x 3 = 6
 2 x 4 = 8
 2 x 5 = 10
 2 x 6 = 12
 2 x 7 = 14
 2 x 8 = 16
 2 x 9 = 18
 2 x 10 = 20
 */
import java.io.*;
import java.util.*;
public class loops {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    for(int i=1;i<=10;i++)
	    {
	    	System.out.println(n+ " x "+i+" :"+(n*i));
	    } 	
	}

}
