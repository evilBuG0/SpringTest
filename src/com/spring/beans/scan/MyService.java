package com.spring.beans.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	private DAO dao;
	public void add() {
		System.out.println("service当中的add方法调用");
		dao.insert();
	}
	
}
