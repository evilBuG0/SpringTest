package com.spring.beans.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.messaging.handler.invocation.InvocableHandlerMethod;

public class ComputerProxy {
	//即将被代理的对象
	private Computer com;
	public ComputerProxy(Computer computer) {
		this.com=computer;
	}
	//Computer与代理产生关系
	public Computer getComputerproxy() {
		ClassLoader loader=Computer.class.getClassLoader();
		Class[] interfaces= {Computer.class};
		InvocationHandler h=new InvocationHandler() {
			
			//proxy:代理对象
			//method:被代理对象的方法
			//args:方法的参数
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("正在进行"+method.getName());
				//执行被代理对象的核心方法
				Object o=method.invoke(com, args);
				System.out.println("正在结束"+method.getName());
				return o;
			}
		};
		Computer com=(Computer) Proxy.newProxyInstance(loader, interfaces, h);
		return com;
		
	}
}
