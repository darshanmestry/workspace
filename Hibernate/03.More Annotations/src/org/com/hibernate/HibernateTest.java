package org.com.hibernate;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		user.setUserID(1);
		user.setName("Cristiano");
		user.setDate(new Date());
		user.setAddress("This is address");
		user.setDescription("this is description");
		
		
	
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user=null;
		session=sessionFactory.openSession();
		user=(UserDetails)session.get(UserDetails.class, 1);
		System.out.println("Username recieved is:"+user.getName());
		
		
		
		

	}

}
