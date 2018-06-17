package com.spring.beans.aop;

import org.springframework.stereotype.Component;

@Component
public class Computerimpl implements Computer {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int result=a+b;
		return result;
	}

	@Override
	public int sub(int a, int b) {
		int result=a-b;
		return result;
	}

	@Override
	public int mul(int a, int b) {
		int result=a*b;
		return result;
	}

	@Override
	public int div(int a, int b) {
		int result=a/b;
		return result;
	}

}
