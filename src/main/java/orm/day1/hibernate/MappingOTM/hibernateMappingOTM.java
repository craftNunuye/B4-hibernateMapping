package orm.day1.hibernate.MappingOTM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import orm.day1.hibernate.insurance;

public class hibernateMappingOTM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Books books= new Books();
		
		books.setBname("C++");
		books.setbPrice(200.00);
		
		Books books2= new Books();
		
		books2.setBname("datwave");
		books2.setbPrice(300.00);
		
        Books books3= new Books();
		
		books3.setBname("javascript");
		books3.setbPrice(1000.00);
		
		
		
		
		Student student= new  Student();
		
		student.setsId(1);
		student.setsName("robel");
		student.setSdep("fullstack");
		student.getBooks().add(books);
		student.getBooks().add(books2);
		student.getBooks().add(books3);
		
		
        Configuration configuration=new Configuration();
		
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Books.class).addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session	= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		
		session.save(books);

		session.save(books2);

		session.save(books3);
		session.save(student);
		
		
		transaction.commit();
		
	}

}
