import java.io.*;
class bike{
	void run(){
		System.out.println("Running");
	}
}
public class splender extends bike {
	void run(){
		System.out.println("Runnung with 60 kms");
	}
 public static void main(String args[])
 {
	 bike b=new splender();
	 b.run();

 }

}
