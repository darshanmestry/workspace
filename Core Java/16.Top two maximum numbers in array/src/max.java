
import java.util.*;
public class max {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int max=0,sec_max=0;
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}	
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				sec_max=max;
				max=arr[i];
			}	
			else if(sec_max < arr[i])
				sec_max=arr[i];
		}
		System.out.println("Max :"+max+"  Sec max :"+sec_max);
        scan.close();
	}

}
