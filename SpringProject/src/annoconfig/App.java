package annoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s8 = factory.getBean(Samsung.class);
		s8.config();
	}
}
