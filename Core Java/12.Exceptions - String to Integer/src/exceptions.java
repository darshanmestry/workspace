import java.io.*;
import java.util.*;
public class exceptions {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	
	try{
		int no=Integer.parseInt(s);
		System.out.println("No pasrsed :"+no);
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Bad String");
	}
}//end main
}
