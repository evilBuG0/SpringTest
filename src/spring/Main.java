package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext sa=new ClassPathXmlApplicationContext("IOC.xml");
		Person p2=(Person) sa.getBean("Person2");
		System.out.println(p2);
	}

}
