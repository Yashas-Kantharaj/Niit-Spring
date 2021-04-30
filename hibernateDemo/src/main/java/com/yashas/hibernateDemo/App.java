package com.yashas.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StudentName studentName = new StudentName(null, "yashas", "kantharaj");
        Student student = new Student(1, studentName, 8, 77);
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //Student s1 = session.get(Student.class, 2);
		//System.out.println(s1);
        session.save(student);
        transaction.commit();
       
    }
}
