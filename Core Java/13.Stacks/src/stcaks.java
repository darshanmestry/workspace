import java.io.*;
import java.util.*;
public class stcaks {
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter how many elements to insert in stack");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element no "+i);
			int no=scan.nextInt();
			st.push(no);
		}
		
		System.out.println("Top of stack is:"+st.peek());
		System.out.println("Popping Stack elements");
		for(int i=0;i<n;i++)
		{
			
			System.out.print(st.pop()+ " ");
		}
		
		
	}
}
