/*
 *
 */
package com.hibernate.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

import org.hibernate.annotations.NamedQuery;

@Entity(name="user_details")
@NamedQuery(name="UserDetails.byId" ,query="from user_details where userID > ?")
@NamedNativeQuery(name="UserDetails.byName", query="select * from user_details where name=?",resultClass=UserDetails.class)

public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userID;
	
	private String name;
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
