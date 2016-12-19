package com.test.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;


public class LogAspect {
	public String afterMethod(JoinPoint joinpoint) {
		String opreate= joinpoint.getSignature().getName();
		System.out.println("opreate"+opreate);
		return "";
	}
}
