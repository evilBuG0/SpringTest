package com.spring.beans.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static  void main(String[] args) {
	/*	
	Computer com=new Computerimpl();
		int a=com.add(5, 3);
		System.out.println(a);
	
	//创建一个计算器类
	Computer computer =new Computerimpl();
	ComputerProxy proxy=new ComputerProxy(computer);
	computer=proxy.getComputerproxy();
	int result=computer.add(1, 2);
	System.out.println(result);*/
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("IOC_scan.xml");
	Computer com=(Computer) ac.getBean("computerimpl");
	System.out.println(com.div(1, 0));
	//System.out.println(com.add(1, 2));
	
}

}
