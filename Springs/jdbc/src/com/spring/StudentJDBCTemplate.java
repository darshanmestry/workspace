package com.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate  implements StudentDAO{

	 DataSource dataSource;
	 JdbcTemplate jdbcTemplateOject;
	@Override
	public void setdataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateOject=new JdbcTemplate(dataSource);
		
	}

	@Override
	public void create(String name, Integer age) {
		String sql="insert into Student (name,age) values(?,?)";
		jdbcTemplateOject.update(sql,name,age);
		System.out.println("Record created:  Name:"+name+" , Age:"+age);
		return;
		
	}

	@Override
	public List<Student> listStudent() {
		String sql="select * from Student";
		List<Student> students=jdbcTemplateOject.query(sql, new StudentMapper());
 		return students;
	}

}
