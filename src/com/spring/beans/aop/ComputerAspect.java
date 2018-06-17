package com.spring.beans.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ComputerAspect {
	//execution切点表达式
	@Before("execution(public int com.spring.beans.aop.Computerimpl.add(int , int ) )")
	public void a() {
		System.out.println("调用前置处理");
	}
	@After("execution(public int com.spring.beans.aop.Computerimpl.add(int , int ) )")
	public void b() {
		System.out.println("调用后置处理");
	}
}
