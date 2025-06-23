package com.dao;

import java.io.ObjectInputFilter.Config;

import org.hibernate.Remove;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class StudentDao {

	public void InsertData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student sd = new Student();
		sd.setStudNam("Harshal");
		sd.setCity("Pune");
		sd.setDOB("27/11/25");
		sd.setGender("Male");

		ss.persist(sd);
		tr.commit();

		System.out.println("Data is Successfull....");

		ss.close();

	}

	public void UpdateData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 2;

		Student e1 = ss.get(Student.class, id);

		e1.setStudNam("Harshi");
		e1.setGender("Male");
		e1.setDOB("12/11/26");
		e1.setCity("nsk");

		ss.merge(e1);
		tr.commit();

		System.out.println("Data Successfully Update....");

		ss.close();

	}

	public void DeleteData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int StudId = 1;

		Student st = ss.get(Student.class, StudId);
		ss.remove(st);

		tr.commit();
		ss.close();

		System.out.println("Data is Deleted...");

	}

}
