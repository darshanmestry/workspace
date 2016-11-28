/*
 * Fist show where clasue using variable to store it.
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
		int maxid=5;
	  /*  Query query =session.createQuery(" from user_details where userID>"+maxid);*/
		 /* Query query =session.createQuery(" from user_details where userID>?");*/
		  Query query =session.createQuery(" from user_details where userID>:userId");
		  query.setInteger("userId", maxid);
	      List<UserDetails> user=(List<UserDetails>)query.list();
	   
	    System.out.println("Size of users:"+user.size());
	
	    for(UserDetails u:user)
	    {
	    	System.out.println(u.getName());
	    }
	    session.getTransaction().commit();
		session.close();
	
		

	}

}
