/*
 Given a string,S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as
 2 space-separated strings on a single line.
 
 INPUT FORMAT
 The first line contains an integer, T (the number of test cases).
 Each line i of the  subsequent lines contain a String,S.
 
 SAMPLE INTPUT
 2
 Hacker
 Rank
 
 SAMPLE OUTPUT
 Hce akr
 Rn ak
 */
import java.io.*;
import java.util.*;
public class solution {
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
        int T=scan.nextInt();
        String[] str=new String[T];
        scan.nextLine();
        for(int i=0; i< T; i++) {
            str [i]= scan.nextLine();
        }
       
        for(int  i=0;i<str.length;i++)
        {
            char[] ch=str[i].toCharArray();
              for(int j=0;j<str[i].length();j=j+2)
              {
                  System.out.print(ch[j]);
           
              } 
               System.out.print(" ");
               for(int  j=1;j<str[i].length();j=j+2)
              {
                  System.out.print(ch[j]);
           
              } 
            System.out.println();
        } 
     
        
	}//end main

}
