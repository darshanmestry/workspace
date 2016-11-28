/*
 Task:
 Write a factorial function that takes a positive integer, N as a parameter and prints the result of N!(N factorial)
 
 */
import java.io.*;
import java.util.*;
public class solution {
	 public int fact(int n)
	 {
		 int fa;
		 if(n==0)
		  return 1;
		 else
			 fa=n*fact(n-1);
		 
		 return fa;
	}
	 public static void main(String args[])
	 {
		 solution s=new solution();
		 Scanner  scan=new Scanner(System.in);
		 int n=scan.nextInt();
		 int ans=s.fact(n);
		 System.out.println(ans);
		 
	 }
}
