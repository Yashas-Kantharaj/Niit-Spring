package aop.main;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class LoggingAspects {
//	@Before("allCircleMethods()")
//	public void loggingAdvice() {
//		System.out.println("writing log before method is executed");
//	}
	@Pointcut("execution(* aop..*.get*())")
	public void allGetters() {}
//	
//	@Pointcut("within(aop.model.Circle)")
//	public void allCircleMethods() {}
	
	public void myLogginAdvice() {
		System.out.println("my logging advice");
	}

	@Around("@annotation(aop.aspects.Loggable)")
	public void myAroundAdvice(ProceedingJoinPoint pjp) {
		
		try {
			System.out.println("before advice");
			pjp.proceed();
			System.out.println("after method returns advice");

		} catch (Throwable e) {
			System.out.println("after throwing");
			//e.printStackTrace();
		} System.out.println("finally advice");
		
	}
}
