/*
 TASK:
 Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone
 numbers. You will then be given an unknown number of names to query your phone book for. For each name
 queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry 
 for name is not found, print Not found instead. 
 
 INPUT FORMAT:
 The first line contains an integer,n, denoting the number of entries in the phone book. 
 Each of the n subsequent lines describes an entry in the form of 2 space-separated values on a single line. 
 The first value is a friend's name, and the second value is an -digit phone number.
 
 After the n  lines of phone book entries, there are an unknown number of lines of queries. Each line (query) contains a
 name  to look up, and you must continue reading lines until there is no more input.
 
 SAMPLE INPUT
 3
 sam 99912222
 tom 11122222
 harry 12299933
 sam
 edward
 harry
 
 SAMPLE OUTPUT
 sam=99912222
 Not found
 harry=12299933
 */
import java.io.*;
import java.util.*;
public class solution {
public static void main(String args[])
{
	Map<String,Integer> map=new HashMap<String,Integer>();
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for(int i=0;i<n;i++)
	{
		String name=scan.next();
		int phone=scan.nextInt();
		map.put(name,phone);
	}
	
	while(scan.hasNext())
	{
		String s=scan.next();
		
		if(map.containsKey(s))
		{
			System.out.println(s+" = "+map.get(s));
		}	
		else
		{
			System.out.println("Entry not found");
		}
	}
}
}
