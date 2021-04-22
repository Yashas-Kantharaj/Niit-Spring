package aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
//		ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
		FactoryService context = new FactoryService();
		ShapeService shapeService = (ShapeService) context.getBean("shapeService");
		System.out.println(shapeService.getCircle().getName());
//		System.out.println(shapeService.getCircle().getDia());
//		shapeService.getCircle().setName("semi circle");
//		System.out.println(shapeService.getCircle().getName());
	}

}