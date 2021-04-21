package aop.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class LoggingAspects {
	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("writing log before method is executed");
	}
	@Pointcut("execution(* aop..*.get*())")
	public void allGetters() {}
}
