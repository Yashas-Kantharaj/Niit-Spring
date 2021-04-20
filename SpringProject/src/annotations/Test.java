package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Vehicle.xml");
	
	Vehicle v = (Vehicle) context.getBean("car");
	//Vehicle vehicle = (Vehicle) context.getBean("bike");
	v.drive();
	//vehicle.drive();
}
}
