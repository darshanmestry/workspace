package com.spring;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	
	public void setdataSource(DataSource dataSource);
	public void create(String name,Integer age);
	public List<Student> listStudent();
	

}
