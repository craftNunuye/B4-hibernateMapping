package com.orm_JPA;

import java.lang.annotation.Annotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp = new Employee();
		emp.setAge(39);
		emp.setfName("Hanna");
		emp.setlName("koy");
		emp.setSalary(103000);
		
		Employee emp1 = new Employee();
		emp1.setAge(49);
		emp1.setfName("Ronna");
		emp1.setlName("Bob");
		emp1.setSalary(203000);
		
		
		//Persistence persis = new Persistence();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alsql"); 
		EntityManager eManage = entityManagerFactory.createEntityManager();	
		
		eManage.getTransaction().begin();
			// persist or save operation
//		eManage.persist(emp);
//		eManage.persist(emp1);
//		
		// to select a data/find
//		emp1 = eManage.find(Employee.class, 1);
//		System.out.println(emp1);
		
		
		
		// to update first we need to use find method.
				emp1 = eManage.find(Employee.class, 1);
				emp1.setAge(63);
				System.out.println(emp1);
				
				// to delete first we need to use find method to select.
				 eManage.remove(emp1);
				
	
		
		
		
		eManage.getTransaction().commit();
		
		
					
					
	}

}
