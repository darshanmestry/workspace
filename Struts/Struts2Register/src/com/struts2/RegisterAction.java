package com.struts2;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {  
private String user,password,name;  
  
//setters and getters  
public String  getUser()
{
	return user;
	
}
public String getPassword(){
	return password;
}
 public String getName(){
	 return name;
 }

 public void setUser(String user)
 {
	 this.user=user;
 }
 public void setPassword(String password)
 {
	 this.password=password;
 }
  public void setName(String name)
 {
	 this.name=name;
 }

public String execute(){  
	String ret=ERROR;
    int i=RegisterDao.save(this);  
    if(i>0){  
   ret=SUCCESS;
   return ret;
    }  
    return Action.ERROR;
}  
}  