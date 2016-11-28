package org.com.hibernate;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		UserDetails user2=new UserDetails();
		user.setName("Cristiano");
		user.setDate(new Date());
		user.setAddress("This is address");
		user.setDescription("this is description");
		
		user2.setName("Ronaldo");
		user2.setDate(new Date());
		user2.setAddress("This is address");
		user2.setDescription("this is description");
		
	
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		
		
		
		

	}

}
