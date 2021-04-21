package aop.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class LoggingAspects {
	@Before("execution(* aop.main..*.*(..))")
	public void loggingAdvice() {
		System.out.println("writing log before method is executed");
	}
}
