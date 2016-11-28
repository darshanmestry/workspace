import java.io.*;
import java.util.*;
class super_class{
	int num=10;
	public void display(){
		System.out.println("this is method of Super class.");
	}
}
public class superkey extends super_class{
  int num=20;
  public void display(){
	  System.out.println("This is method of sub class");
  }
  void show()
  {
	  superkey s=new superkey();
	  s.display();
	  super.display();
	  
	  System.out.println("Sub class num  : "+s.num);
	  System.out.println("Super class num: "+super.num);
  }
 public static void main(String args[])
 {
	 superkey s=new superkey();
	 s.show();
	
 }
}
