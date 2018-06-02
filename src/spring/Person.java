package spring;

import java.util.*;
public class Person {
	private String name;
	private int age;
	private List<Car> cars;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public List<Car> getCar() {
		return cars;
	}
	public void setCar(List<Car> car) {
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
	public Person() {}
}
