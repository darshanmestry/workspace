/*
 * 1)Add code for mapping in Hibernate.cfg.xml
 * 2)remove Discriminator name to subclass TwoWheeler and FourWheeler 
 * 3)Remove Discriminator as it is only needed for Single table
 */

package com.hibernate.dto;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Vehicle {
@Id @GeneratedValue(strategy=GenerationType.TABLE)
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
