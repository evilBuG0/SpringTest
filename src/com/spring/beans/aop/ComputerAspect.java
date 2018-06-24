package com.spring.beans.aop;

import java.util.Arrays;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ComputerAspect {
	
	@Pointcut("execution(public int com.spring.beans.aop.Computerimpl.*(..) )")
	public void getExcecution(){
		
	}
	
	//execution切点表达式
	//*;通配符，所有
	//..;在方法的参数列表中使用，不限定类型，顺序，个数
	@Before("getExcecution()")
	public void a(JoinPoint Jp) {
		//在通知方法的内部，如果想访问连接点的细节需要JoinPoint：接口类型
		Object[] args=Jp.getArgs();
		String methodname=Jp.getSignature().getName();
		
		System.out.println("调用"+methodname+"前置处理,参数为："+Arrays.asList(args));
	}
	@After("getExcecution()")
	public void b(JoinPoint Jp) {
		Object[] args=Jp.getArgs();
		String methodname=Jp.getSignature().getName();
		System.out.println("调用"+methodname+"后置处理,参数为："+Arrays.asList(args));
	}
	/*
	 * 如何获取方法执行之后的返回值
	 * 1：需要在特定的标注@AfterReturning（returning="变量的名称"）作用：告知spring要获取目标对象（被代理对象）方法的返回值result
	 * 2：通知的参数列表当中，指定一个形参名字和returning属性中的名字一致
	 * 
	@AfterReturning(pointcut="getExcecution()",returning="result")
	public void c(JoinPoint Jp,Object result) {
		Object[] args=Jp.getArgs();
		String methodname=Jp.getSignature().getName();
		System.out.println("调用"+methodname+"返回通知处理,参数为："+Arrays.asList(args)+"正常返回结果为："+result);
	}
	@AfterThrowing(pointcut="getExcecution()",throwing="ex")
	public void d(JoinPoint jo,Exception ex) {
		String methodname=jo.getSignature().getName();
		Object []args=jo.getArgs();
		System.out.println("调用"+methodname+"返回通知处理,参数为："+Arrays.asList(args)+"出现异常信息为："+ex.getMessage());
	}
	*/
	
	/*@Around("execution(public int com.spring.beans.aop.Computerimpl.*(..))")
	public void e(ProceedingJoinPoint pjp) {
		try {
			//前置通知
			
			pjp.proceed();
			//返回通知
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			//可加入异常通知内容
			e1.printStackTrace();
		}
		//后置通知
	}*/
}
