package com.spring;

import java.util.*;

import javax.sql.DataSource;

public interface StudentDAO {
	
	public void setDataSource(DataSource dataSource);
	
	public void create(String name,Integer age);
	
	public List<Student> listStudent();

}
