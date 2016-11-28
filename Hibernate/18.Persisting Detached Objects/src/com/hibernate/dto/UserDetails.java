/*
 * @org.hibernate.annotations.Entity(selectBeforeUpdate=true) CHECKS IF USER OBJECT IS CHANGED.IT SO THAN IT IS UPDATED OTHER WISE IT IS NOT.
 */
package com.hibernate.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user_details")
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
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
