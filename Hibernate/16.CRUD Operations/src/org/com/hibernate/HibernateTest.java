/*
 * FOR RETRIEVING DATA CHANGE CREATE TO UPDATE IN XML FILE
 * TO DELETE AN OBJECT FIRST PULL UP(RETRIEVE AN OBJECT THAN DELETE IT)
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
		/*for(int i=0;i<10;i++)  //CODE FOR INSERT INI OBJECT
		{		
			UserDetails user=new UserDetails();
			user.setName("user:"+i);
			session.save(user);
		
		}*/
		
		/*UserDetails user=(UserDetails) session.get(UserDetails.class, 6);//RETRIEVE AN OBJECT
		System.out.println("Username pulled up is:"+user.getName());*/
		
		/*UserDetails user=(UserDetails) session.get(UserDetails.class, 6);//CODE FOR DELETE AN OBJECT
		session.delete(user);*/
		UserDetails user=(UserDetails) session.get(UserDetails.class, 5);
		user.setName("Updated user");
		session.update(user);
		   session.getTransaction().commit();
		
		
		
		

	}

}
