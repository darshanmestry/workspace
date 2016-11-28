package com.struts2.register;

public class RegisterAction {  
private String name,password,email,gender,country;  
  
//setters and getters  
public String execute(){  
    int i=RegisterDao.save(this);  
    if(i>0){  
    return "success";  
    }  
    return "error";  
}  
}  