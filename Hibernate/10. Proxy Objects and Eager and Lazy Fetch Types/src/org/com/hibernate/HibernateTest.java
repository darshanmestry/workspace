/*
 * When user object  is created what values are retrieved?
 * As it has list if addresses.Does All addresses are also retrieved?
 * If so then what will happen if there are 100s of addresses and and all are getting retrieved and we only want 1st level values
 * Here Hibernate uses proxy objects and uses lazy initialization
 */

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
		
		user.setName("Mike Ross");
		Address addr=new Address();
		addr.setCity("pune");
		addr.setPincode("433009");
		addr.setState("Maharashtra");
		addr.setStreet("FC road");
		
	
		
		
		Address addr2=new Address();
		addr2.setCity("Nashik");
		addr2.setPincode("433009");
		addr2.setState("Maharashtra");
		addr2.setStreet("MG ROAD");
		
	
		user.getListAddress().add(addr);
		user.getListAddress().add(addr2);
		
		
  
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user=null;
		
		session=sessionFactory.openSession();
		user=(UserDetails)session.get(UserDetails.class, 1);
		session.close(); //too check if lazy initialization is happening than go and change annotation to EAGER in user details
		System.out.println("Size:"+user.getListAddress().size());
		
		

	}

}
