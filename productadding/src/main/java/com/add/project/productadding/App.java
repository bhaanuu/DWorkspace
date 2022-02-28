package com.add.project.productadding;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {

	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(students.class).buildSessionFactory();
	

	Session theSession = factory.getCurrentSession();
	
	try {

		students theLearner = new students("Bhanu",123,"devops",1215);
		
		
		theSession.beginTransaction();
		
		theSession.save(theLearner);
		
		theSession.getTransaction().commit();
		System.out.println("new students sucessfully inserted ");
		System.out.println("Learner id : " + theLearner.name);
		
		
}finally {
		factory.close();
	}
    }
}




