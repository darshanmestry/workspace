/*

 */
package com.hibernate.dto;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
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
	@ElementCollection
	private Set<Address> listAddress=new HashSet<>();
	
	
	public Set<Address> getListAddress() {
		return listAddress;
	}
	public void setListAddress(Set<Address> listAddress) {
		this.listAddress = listAddress;
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
