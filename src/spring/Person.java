package spring;

import java.util.*;
public class Person {
	private String name;
	private int age;
	private List<Car> cars;
	
	public Person() {
		System.out.println("进入到构造器中；");
	}
	
	public void a() {
		System.out.println("走入到初始化方法");
	}
	public void b() {
		System.out.println("销毁方法调用了");
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		System.out.println("setname方法");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("setAge方法");
		this.age = age;
	}
	

	public List<Car> getCar() {
		return cars;
	}
	public void setCar(List<Car> car) {
		System.out.println("setCar方法");
		this.cars = car;
	}
	
	public Person(String name, int age, List<Car> car) {
		super();
		this.name = name;
		this.age = age;
		this.cars = car;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
}
