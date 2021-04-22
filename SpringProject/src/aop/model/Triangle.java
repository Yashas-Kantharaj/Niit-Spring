package aop.model;

public class Triangle {
	String name;
	
//	public Triangle() {
//		System.out.println("inside triangle");
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name for triangle");
		this.name = name;
	}
	

}

