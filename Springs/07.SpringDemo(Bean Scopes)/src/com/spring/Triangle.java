package com.spring;

public class Triangle {
	 
	private int height;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw(){
		System.out.println(" triangle drawn of height"+getHeight());
	}

}
