package com.yashas.hibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "student")
public class Student {
	@Id
	int id;
	//@Transient
	String name;
	//@Column(name = "trimester")
	int sem;
	int average;
	public Student(int id, String name, int sem, int avg) {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getAvg() {
		return average;
	}
	public void setAvg(int avg) {
		this.average = avg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+id+"\t"+name+"\t"+sem+"\t"+average;
	}
	
}
