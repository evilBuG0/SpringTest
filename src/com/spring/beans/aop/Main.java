package com.spring.beans.aop;

public class Main {
public static  void main(String[] args) {
	/*	
	Computer com=new Computerimpl();
		int a=com.add(5, 3);
		System.out.println(a);
	*/
	//创建一个计算器类
	Computer computer =new Computerimpl();
	ComputerProxy proxy=new ComputerProxy(computer);
	computer=proxy.getComputerproxy();
	int result=computer.add(1, 2);
	System.out.println(result);
}

}
