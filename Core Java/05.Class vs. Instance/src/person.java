/*
 Write a Person class with an instance variable,age, and a constructor that takes an integer, initialAge, as a
 parameter. The constructor must assign initialAge to age  after confirming the argument passed as initialAge  is 
 not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print  age 
 is not valid, setting age to 0.In addition, you must write the following instance methods:
 
 1.)yearPasses() should increase the age instance variable by 1.
 2.)amIOld() should perform the following conditional actions:
   *If age<13, print You are young.
   *If  age>13 and age<18 , print You are a teenager.
   *Otherwise, print You are old.
   
  SAMPLE INPUT:
  4
 -1
 10
 16
 18
 
  SAMPLE OUTPUT
  Age is not valid, setting age to 0.
  You are young.
  You are young. 

  You are young.
  You are a teenager.

  You are a teenager.
  You are old.

  You are old.
  You are old.
 */
import java.io.*;
import java.util.*;
public class person {
	private int age;
	public person (int initialAge)
	{
		// Add some more code to run some checks on initialAge
		if(initialAge < 0)
		{
			age=0;
			System.out.println("Age is not valid,Seting age to 0");
			
		}	
		else
			age=initialAge;
	}
	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
		if(age<13)
			System.out.println("You are young");
		else if(age>13 && age<18)
			System.out.println(" You are teenager");
		else
			System.out.println("You are old");
        
	}
	public void yearPasses() {
  		// Increment this person's age.
		age++;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			person p = new person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }

}
