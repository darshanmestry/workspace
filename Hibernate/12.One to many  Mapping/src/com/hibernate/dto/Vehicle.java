/*
 * 1)Add code for mapping in Hibernate.cfg.xml
 */

package com.hibernate.dto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
@Id @GeneratedValue
private int vechileId;
private String vehicleName;
public int getVechileId() {
	return vechileId;
}
public void setVechileId(int vechileId) {
	this.vechileId = vechileId;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}

}
