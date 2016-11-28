/*

 */
package com.hibernate.dto;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
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
	@Embedded
	
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="HOME_STREET_ADDR")),
	
	@AttributeOverride(name="city",  column=@Column(name="HOME_CITY_ADDR")),
	
	@AttributeOverride(name="state",column=@Column(name="HOME_STATE_ADDR")),
	
	@AttributeOverride(name="pincode",column=@Column(name="HOME_PINCODE")),
  })
	
	private Address homeAddress;
	private Address officeAddress;
	
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
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
