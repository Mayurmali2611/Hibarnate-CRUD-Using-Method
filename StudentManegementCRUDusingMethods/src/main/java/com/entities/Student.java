package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int StudId;
	String StudName;
	String Gender;
	String DOB;
	String City;

	public int getStudId() {
		return StudId;
	}

	public void setStudId(int studId) {
		StudId = studId;
	}

	public String getStudNam() {
		return StudName;
	}

	public void setStudNam(String studNam) {
		StudName = studNam;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	

	public Student(int studId, String studName, String gender, String dOB, String city) {
		super();
		StudId = studId;
		StudName = studName;
		Gender = gender;
		DOB = dOB;
		City = city;
	}

	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [StudId=" + StudId + ", StudNam=" + StudName + ", Gender=" + Gender + ", DOB=" + DOB + ", City="
				+ City + "]";
	}

}
