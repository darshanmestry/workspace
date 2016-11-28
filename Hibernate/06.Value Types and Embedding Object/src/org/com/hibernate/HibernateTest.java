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
		
		user.setName("Cristiano");
		Address addr=new Address();
		addr.setCity("pune");
		addr.setPincode("433009");
		addr.setState("Maharashtra");
		addr.setStreet("FC road");
		
		user.setAddress(addr);

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
		
		
		

	}

}
