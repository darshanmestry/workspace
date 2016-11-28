/*
/*
 * natural key:email
 * surrogate key:its eg is ID which we use in table for our reference but not used to display or do business logic
 * @GeneratedValue
 * @GeneratedValue (Strategy)

 */
package com.hibernate.dto;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="User_Details")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userID;

	private String name;
	@Temporal (TemporalType.DATE)
	private Date date;
	private String address;
	@Lob	
	private String description;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
