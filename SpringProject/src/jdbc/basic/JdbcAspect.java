package jdbc.basic;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class JdbcAspect {
	
	@Before("execution(* jdbc..*.*(..))")
	void log() {
		System.out.println("before");
	}
}
