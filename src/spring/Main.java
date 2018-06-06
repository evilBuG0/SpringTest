package spring;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext sa=new ClassPathXmlApplicationContext("IOC.xml");
		//Person p2=(Person) sa.getBean("Person");
		//System.out.println(p2);
		DateFormat df=(DateFormat) sa.getBean("dateFormat");
		Date sdf=(Date) sa.getBean("Date");
		System.out.println(sdf);
		//System.out.println(df);
	}

}
