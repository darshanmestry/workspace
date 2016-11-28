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
		Vehicle vehicle=new Vehicle();
		
		user.setName("Mike Ross");
		
		vehicle.setVehicleName("car");
	
		
		user.setVehicle(vehicle);
		
			
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		session.save(vehicle);
		
		session.getTransaction().commit();
		
		session.close();
	
	}

}
