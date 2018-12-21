package com.care.aop_ex01;

import org.aspectj.lang.ProceedingJoinPoint;

public class CommonClass {
	public void commonAop(ProceedingJoinPoint joinpoint	) {
		System.out.println("공통기능 사용 프로세스: "+joinpoint.getSignature().toShortString());
		try {
			System.out.println("=======로그인 한 시간 시작=======");
			joinpoint.proceed(); 
			System.out.println("=======로그인 한 시간 종료=======");
		}catch (Throwable e) {
			e.printStackTrace();
		}
	}
	public void beforeAdvice() {
		System.out.println("핵심 기능 전에 실행");
	}
	
	
	
}
