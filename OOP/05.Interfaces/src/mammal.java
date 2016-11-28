
public class mammal implements animal {
public void eat(){
	System.out.println("Mammaml eats");
}
public void travel(){
	System.out.println("mammal travels");
}
public static void main(String args[]){
	mammal m=new mammal();
	m.eat();
	m.travel();
}
}
