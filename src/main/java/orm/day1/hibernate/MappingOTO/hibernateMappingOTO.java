package orm.day1.hibernate.MappingOTO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import orm.day1.hibernate.insurance;

public class hibernateMappingOTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Books books= new Books();
		
		books.setBname("C++");
		books.setbPrice(200.00);
		
		
		Student student= new  Student();
		
		student.setsId(2);
		student.setsName("robel");
		student.setSdep("fullstack");
		student.setBooks(books);		
		
        Configuration configuration=new Configuration();
		
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Books.class).addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session	= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		
		session.save(books);
		session.save(student);
		
		
		transaction.commit();
		
	}

}
