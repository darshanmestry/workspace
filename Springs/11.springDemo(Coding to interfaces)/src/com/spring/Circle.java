package com.spring;

public class Circle implements Shape {

	 Point centre;
	
	
	
	

	public Point getCentre() {
		return centre;
	}





	public void setCentre(Point centre) {
		this.centre = centre;
	}





	public void draw() {
		System.out.println("Drawing Circle");

     System.out.println("The circle: point is: ("+centre.getX()+" , "+centre.getY()+" )");
	}

}
