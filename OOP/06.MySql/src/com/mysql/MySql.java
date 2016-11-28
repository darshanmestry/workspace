package com.mysql;

import java.sql.DriverManager;
import java.sql.*;


public class MySql {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement st=con.createStatement();
			String sql="insert into student values(23,'adsad',32)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.execute();
			ResultSet rs=st.executeQuery("select * from student");
			
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
			}	
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}

	}

}
