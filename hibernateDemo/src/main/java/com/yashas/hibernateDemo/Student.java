package com.yashas.hibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "student")
public class Student {
	@Id
	int id;
	StudentName name;
	//@Column(name = "trimester")
	int sem;
	int average;
	public Student(int id, StudentName name, int sem, int avg) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.average = avg;
	}
	public  Student() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public StudentName getName() {
		return name;
	}
	public void setName(StudentName name) {
		this.name = name;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+id+"\t"+name+"\t"+sem+"\t"+average;
	}
	
}
