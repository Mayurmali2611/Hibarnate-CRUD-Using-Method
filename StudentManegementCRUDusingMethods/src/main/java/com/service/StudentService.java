package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dao.StudentDao;
import com.entities.Student;

public class StudentService {
	
	public static void main(String[] args) {
		
	}
		public void UpdateData() {
			
			StudentDao sd = new StudentDao();
			sd.UpdateData();
			
			
			
		
	}
		public void DeleteData() {
            
			StudentDao sd = new StudentDao();
			sd.DeleteData();
			
		}
		public void InsertData() {
			
			StudentDao sd = new StudentDao();
			sd.InsertData();
			
			
			
		}
	
	

}
