/*
 * Transient object:If object is created and not passed to session.save() method object is called transient object
 * Persistent object:if object is save it is called persistent object,when object is persisten hibernate tracks the object
 */

package org.com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails user=new UserDetails();
		user.setName("Test user");

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		
	    user.setName("updated user");
	    user.setName("updated user again");
	
	    session.getTransaction().commit();
		session.close();
		
		user.setName("updated user after session close");
		
		
		

	}

}
