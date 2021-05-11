package com.example.demo.aop;

import java.sql.Timestamp;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class LoggingAspects {
	
	@Before("execution(* com.example.demo.service.EmployeeServiceImpl.*(..))")
	public void myLogginAdviceBefore(JoinPoint jp) {
		System.out.println("\n\nThe Class executing is "+jp.getTarget().getClass().getName());
		System.out.println("The method executing is "+jp.getSignature().getName());
		Timestamp timestamp = new Timestamp(new java.util.Date().getTime());
		System.out.println(timestamp);
	}
	
}
