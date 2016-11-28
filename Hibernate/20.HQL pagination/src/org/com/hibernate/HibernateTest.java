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
		
	    Query query =session.createQuery("select name from user_details");
        query.setFirstResult(5);
        query.setMaxResults(3);
	List<String> user=(List<String>)query.list();
	   
	    System.out.println("Size of users:"+user.size());
	
	    for(String u:user)
	    {
	    	System.out.println(u);
	    }
	    session.getTransaction().commit();
		session.close();
	
		

	}

}
