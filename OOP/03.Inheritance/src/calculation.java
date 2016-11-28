import java.io.*;
import java.util.*;
 class mycalc {
int z;
void add(int x,int y){
	z=x+y;
	System.out.println("ADD  :" +z);
}
void sub(int x,int y)
{
	z=x-y;
	System.out.println("SUB  :" +z);
}
}
public class calculation extends mycalc{
	void mul(int x,int y)
	{
		z=x*y;
		System.out.println("MUL  :" +z);
	}
	public static void main(String args[])
	{
		int x=20,y=10;
		calculation c=new calculation();
		c.mul(x, y);
		c.add(x, y);
		c.sub(x, y);
	}
	
}
