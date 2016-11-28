/*
 TASK:

 Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
 and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
 
 INPUT FORMAT:
 There are  3 lines of numeric input: 
 1.The first line has a double, MealCost (the cost of the meal before tax and tip). 
 2.The second line has an integer, tipPercent (the percentage of mealCost being added as tip). 
 3.The third line has an integer,  taxPercent (the percentage of mealCost being added as tax).
 
 OUTPUT FORMAT:
 Print The total meal cost is totalCost., where totalCost is the rounded integer result of the entire bill (mealCost with added tax and tip).
 
 SAMPLE INPUT:
 12.00 
 20
 8	
 
 

 SAMPLE OUTPUT:
 Asnwer is 15.36 round it to 15
 The total meal cost is 15 INR.
 
 */
import java.io.*;
import java.util.*;
public class operators {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		double mealCost=scan.nextDouble();
		double tipPercent=scan.nextDouble();
		double taxpercent=scan.nextDouble();
		
		double tip=mealCost*(tipPercent/100);
		double tax=mealCost*(taxpercent/100);
		
		int totalCost=(int) Math.round(mealCost+tip+tax);
		
		 System.out.println("Total meal cost:"+totalCost+" INR.");
	}

}
