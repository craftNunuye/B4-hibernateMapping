 package com.orm_JPA_CapstoneProject;


import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsuranceApp {

	public static void main(String[] args) {

		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("insurance");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		
		// policy_type, policy and user-policy
		
		
		Policy_type pt1 = new Policy_type();
		pt1.setPolicy_type_id(206);
		pt1.setPolicy_type_name("policy 11");
		pt1.setDescription("Renter's insurance Five");
		

		
		Policy pol = new Policy();
		pol.setPolicy_id(304);
		pol.setPolicy_name("policy 12");
		pol.setDescription("Insurance five");
		
		pol.setPolicy_type(pt1);
		
		
		
		Role_type rType = new Role_type();
		rType.setRole_id(901);
		rType.setRole_name("Admin 7"); 
		
		
		Users user3 = new Users();
		user3.setUser_id(2001);
		user3.setFname("Almaz");
		user3.setLname("Getner");
		user3.setAddress("London");
		user3.setPhone("793456");
		user3.setEmail("me@me.com");
		user3.setPassword("993*99");
		
		user3.setRole_type(rType);
		
//		entityManager.persist(rType);
//		entityManager.persist(user3);
		
		
		
		
		User_policy uPol1 = new User_policy();
		uPol1.setUser_policy_id(401);
		uPol1.setOffered_date(new Date());
		uPol1.setExpiry_date(new Date());
		uPol1.setIs_active(false); 
		
		// persist data
			/* uPol1.setPolicy(pol);
			uPol1.setUsers(user3);
			
			
			entityManager.persist(pt1);
			entityManager.persist(pol);
			entityManager.persist(uPol1); */
		
		
		// read data Example 
		
		user3 = entityManager.find(Users.class, 701);
		System.out.println("User is " + user3.getFname() +" "+ user3.getLname());
		System.out.println("The address is "+ user3.getAddress());
		
		
		// update data example
		
		user3 = entityManager.find(Users.class, 701);
		System.out.println("Before the update  email of user is " + user3.getEmail());
		user3.setEmail("updated@email.com");
		System.out.println("After the update  email of user is " + user3.getEmail());
		
		
		// delete data example
		
			entityManager.remove(user3);
		
	
		entityManager.getTransaction().commit();
		
		entityManager.close();
	
	}

}
