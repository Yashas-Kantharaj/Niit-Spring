package aop.model;

public class Circle {
	String name;
	

	public Circle() {
		System.out.println("inside circle");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name for circle");
		this.name = name;
	}
	public int getDia() {
		return 5;
	}
	
	

}