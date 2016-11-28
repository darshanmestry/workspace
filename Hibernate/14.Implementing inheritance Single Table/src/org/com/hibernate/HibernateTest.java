/*
 */

package org.com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dto.FourWheeler;
import com.hibernate.dto.TwoWheeler;
import com.hibernate.dto.UserDetails;
import com.hibernate.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("car");
		
		TwoWheeler bike=new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("Bike Streeing handle");
		
		FourWheeler car=new FourWheeler();
		car.setVehicleName("Porsche");
		car.setStreeingWheel("Streeing wheel");
	
	
	
		
		
			
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(vehicle);
		session.save(bike);
		session.save(car);
		
		session.getTransaction().commit();
		
		session.close();
	
	}

}
