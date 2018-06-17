package com.spring.beans.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ComputerAspect {
	//execution切点表达式
	//*;通配符，所有
	//..;在方法的参数列表中使用，不限定类型，顺序，个数
	@Before("execution(public int com.spring.beans.aop.Computerimpl.*(..) )")
	public void a(JoinPoint Jp) {
		//在通知方法的内部，如果想访问连接点的细节需要JoinPoint：接口类型
		Object[] args=Jp.getArgs();
		String methodname=Jp.getSignature().getName();
		
		System.out.println("调用"+methodname+"前置处理,参数为："+Arrays.asList(args));
	}
	@After("execution(public int com.spring.beans.aop.Computerimpl.*(..) )")
	public void b(JoinPoint Jp) {
		Object[] args=Jp.getArgs();
		String methodname=Jp.getSignature().getName();
		System.out.println("调用"+methodname+"后置处理,参数为："+Arrays.asList(args));
	}
	//如何获取方法执行之后的返回值
	@AfterReturning(pointcut="execution(public int com.spring.beans.aop.Computerimpl.*(..) )",returning="result")
	public void c(JoinPoint Jp,Object result) {
		Object[] args=Jp.getArgs();
		String methodname=Jp.getSignature().getName();
		System.out.println("调用"+methodname+"返回通知处理,参数为："+Arrays.asList(args)+"正常返回结果为："+result);
	}
}
