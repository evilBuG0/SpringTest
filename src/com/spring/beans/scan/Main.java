package com.spring.beans.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("IOC_scan.xml");
		Person a=(Person) ac.getBean("abc");
		a.eat();
		Action action =(Action) ac.getBean("action");
		action.execute();
		
	}

}
