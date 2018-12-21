package com.care.aop_ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect		//Aspect는 공통기능을 사용한다는 어노테이션
public class CommonClass {
	
	@Around("within(com.care.aop_ex02.*)")	//within이나 execution이나 키워드는 같음
	public void commonAop(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("=====공통 기능 시작=====");
			joinpoint.proceed();
			System.out.println("=====공통 기능 끝=====");
		}catch (Throwable e) {
		
		}
	}
	
	@Before("execution(* com.care.aop_ex02.CoreClass.test())")
	public void beforeAdvice() {
		System.out.println("핵심 기능 실행 전 실행되는 메소드");
	}
}
