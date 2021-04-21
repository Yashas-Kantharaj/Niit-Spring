package aop.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class LoggingAspects {
	@Before("allCircleMethods()")
	public void loggingAdvice() {
		System.out.println("writing log before method is executed");
	}
	@Pointcut("execution(* aop..*.get*())")
	public void allGetters() {}
	
	@Pointcut("within(aop.model.Circle)")
	public void allCircleMethods() {}
}
