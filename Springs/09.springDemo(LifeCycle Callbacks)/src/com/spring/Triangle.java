package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle /*implements InitializingBean,DisposableBean*/ {
	
	 Point pointA;
	 Point pointB;
	 Point pointC;
	 
	 
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw(){
		System.out.println("Point A=("+getPointA().getX()+" ,"+getPointA().getY()+")");
		System.out.println("Point B=("+getPointB().getX()+" ,"+getPointB().getY()+")");
		System.out.println("Point C=("+getPointC().getX()+" ,"+getPointC().getY()+")");
	}


	/*@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean init method called IMPLEMENTS");
		
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean Destroy method called IMPLEMENTS");
		
	}*/
	
	public void myInit(){
		System.out.println("InitializingBean init method called");
	}
	public void cleanup(){
		System.out.println("InitializingBean Destroy method called");
	}

}
