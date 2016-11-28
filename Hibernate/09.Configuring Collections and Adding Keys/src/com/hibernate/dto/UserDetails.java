/*
  1)Giving customised name to list address using @joinTable annotation
  2)giving customised name to User id using   joinColumns=@JoinColumn(name="USER_ID")
  3)change set to collection from making primary key in user_address table
  4)in order to support primary keys i.e index use collections tht support indexes
  5)@collectionID tell tht collection should have an indentifier and sppecify properties
  
 */
package com.hibernate.dto;
import java.util.ArrayList;
import java.util.Collection;
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table(name="User_Details")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userID;
	private String name;
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",
	           joinColumns=@JoinColumn(name="USER_ID")
	)
	@GenericGenerator(name="hilo-gen" ,strategy="hilo")//step 2
	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type="long")) //step 1
	  
	private Collection<Address> listAddress=new ArrayList<Address>();
	
	public Collection<Address> getListAddress() {
		return listAddress;
	}
	public void setListAddress(Collection<Address> listAddress) {
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
