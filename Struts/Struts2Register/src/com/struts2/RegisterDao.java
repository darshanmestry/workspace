package com.struts2;

import java.sql.*;  
public class RegisterDao {  
  
public static int save(RegisterAction r){  
int status=0;  
try{  
	String URL = "jdbc:mysql://localhost/struts_tutorial";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(URL, "root", "root");
  
PreparedStatement ps=con.prepareStatement("insert into login  values(?,?,?)");  
ps.setString(1,r.getUser());  
ps.setString(2,r.getPassword());  
ps.setString(3,r.getName());  

          
status=ps.executeUpdate();

  
}catch(Exception e){e.printStackTrace();}  
    return status;  
}  
}  
