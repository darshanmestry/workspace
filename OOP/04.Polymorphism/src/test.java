
class bank
{
	int getRoi()
	{
		return 0;
	}
}
class sbi extends bank {
	int getRoi(){return 8;}
}

class icici extends bank{
	int getRoi(){return 6;}
}

class axis extends bank{
	int getRoi(){return 5;}
}
public class test {
	public static void main(String args[]){
		bank b1=new sbi();
		bank b2=new icici();
		bank b3=new axis();
		
		System.out.println("R O I :"+b1.getRoi());

		System.out.println("R O I :"+b2.getRoi());
		
		System.out.println("R O I :"+b3.getRoi());

}

}
