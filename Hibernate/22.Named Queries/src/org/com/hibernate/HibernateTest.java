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
		
	  
	/*	Query query =session.getNamedQuery("UserDetails.byId");
		query.setInteger(0, 2);*/
		Query query =session.getNamedQuery("UserDetails.byName");
		query.setString(0, "user 3");
		
		
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
