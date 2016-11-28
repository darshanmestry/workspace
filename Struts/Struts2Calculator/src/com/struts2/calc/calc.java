package com.struts2.calc;

import com.opensymphony.xwork2.ActionSupport;

public class calc  extends ActionSupport {
	
	private int x,y;
	private double ans1;
	public void setX(int x)
	{
		this.x=x;
	}
	public int getX()
	{
		return x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public int getY()
	{
		return y;
	}
	public void setAns1(double ans1)
	{
		this.ans1=ans1;
	}
	public double getAns1()
	{
		return ans1;
	}
	public String calculate(){
		ans1=x+y;
		return "success";
	}
	
}
