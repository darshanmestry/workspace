/*
 * 1)Add code for mapping in Hibernate.cfg.xml
 * 2)Add Discriminator name to subclass TwoWheeler and FourWheeler 
 */

package com.hibernate.dto;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="VEHICLE_TYPE",
		discriminatorType=DiscriminatorType.STRING
)
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
