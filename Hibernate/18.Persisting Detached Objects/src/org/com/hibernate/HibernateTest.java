/*
 * HERE CHANGE HDM2DDL TO UPDATE
 * THOUGH ANYTHING IS NOT UPDATED AFTER SESSION CLOSE STILL IN SESSION.UPDATE UPDATE QUERY WILL BE FIRED
 * ENTITY ANNOTATION OF HIBERNATE
 */

package org.com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
	

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		UserDetails user=(UserDetails)session.get(UserDetails.class, 1);
		
	    session.getTransaction().commit();
		session.close();
		
		user.setName("Updated username after session close");
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);
		
		session.getTransaction().commit();
		session.close();
		

	}

}
