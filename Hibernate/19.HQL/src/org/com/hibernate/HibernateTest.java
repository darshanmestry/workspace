/*
 * 
 */

package org.com.hibernate;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
	
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
	    Query query =session.createQuery("from user_details");
	/*	Query query =session.createQuery("from user_details where userID>5");*/
		/*Query query =session.createQuery("select name from user_details ORDER BY userID DESC");*/
	    List<UserDetails> user=(List<UserDetails>)query.list();
	   
	    System.out.println("Size of users:"+user.size());
	  /*  user.forEach(System.out::println);*/
	    for(UserDetails u:user)
	    {
	    	System.out.println(u.getName()+" "+u.getUserID());
	    }
	    session.getTransaction().commit();
		session.close();
	
		

	}

}
