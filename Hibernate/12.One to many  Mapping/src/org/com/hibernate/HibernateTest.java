/*
 */

package org.com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dto.UserDetails;
import com.hibernate.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		user.setName("Mike Ross");
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("car");
	
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehicleName("jeep");
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		
		
			
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
		
		session.close();
	
	}

}
