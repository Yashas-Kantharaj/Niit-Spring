package com.yashas.hibernateDemo;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	String fName;
	String mName;
	String lName;
	StudentName(){}

	public StudentName(String fName, String mName, String l) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = l;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
}
