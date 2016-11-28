package org.com.hibernate;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dto.Address;
import com.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		
		user.setName("Mike Ross");
		Address addr=new Address();
		addr.setCity("pune");
		addr.setPincode("433009");
		addr.setState("Maharashtra");
		addr.setStreet("FC road");
		
	
		
		
		Address addr2=new Address();
		addr2.setCity("Nashik");
		addr2.setPincode("433009");
		addr2.setState("Maharashtra");
		addr2.setStreet("MG ROAD");
		
	
		user.getListAddress().add(addr);
		user.getListAddress().add(addr2);
		
		

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
		
		
		

	}

}
