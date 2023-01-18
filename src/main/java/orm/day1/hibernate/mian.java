package orm.day1.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		insurance insurance= new insurance();
		
		
		insurance.setInsuranceId(5);
		insurance.setInsuranceName("car dfdafk");
		insurance.setInsuranceNum(11111);
		insurance.setInsuranceDec("this is car asdasd");
		
		
		fullName fullName= new fullName();
		
		fullName.setFristName("robel");
		fullName.setMiddleName("shanbel");
		fullName.setLastName("dfsdf");
		
		
		insurance.setFullName(fullName);
		
		
		Configuration configuration=new Configuration();
		
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(insurance.class);
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session	= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();

		
		session.delete(insurance);
		
		
		
		
		transaction.commit();
		
		
		
	}

}
