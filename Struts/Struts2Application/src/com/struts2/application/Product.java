package com.struts2.application;

public class Product {
private int id;
private String name;
private float price;

public int getId()
{
	return id;
}//end getId


public void setId(int id)
{
	this.id=id;
}//setId



public String getName()
{
	return name;
}//getname

public void setName(String name)
{
	this.name=name;
}//setName

public float getPrice()
{
	return price;
}//getPrice
public void setprice(float price)
{
	this.price=price;
}//end setprice

public String execute()
{
 return "success";	
}
}//end class
