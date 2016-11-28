import java.io.*;
import java.util.*;
public class fibonacii {
 public static void main(String argsp[]){
	 int no1=0,no2=1,no3,count;
	 
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter count of fibonacii series");
	count=scan.nextInt();
	System.out.print(no1+"  "+no2);
	
	for(int i=2;i<count;i++)
	{
		no3=no1+no2;
		System.out.print(" "+no3);
		no1=no2;
		no2=no3;
	}//end for
 }
}
