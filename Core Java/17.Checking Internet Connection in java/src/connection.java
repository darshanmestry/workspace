import java.net.*;
public class connection {
	public static void main(String args[])
	{
		try{
			URL url=new URL("http://www.google.com/");
			URLConnection con=url.openConnection();
			con.connect();
			System.out.println("Conencted to internet");
			
		}
		catch (Exception e) {
			System.out.println("Not Conencted to internet");
		}
	}

}
	