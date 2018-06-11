package com.spring.beans.scan;

import org.springframework.stereotype.Component;
/*
 * 1.component 标注无需指定创建bean的ID的值，默认的命名策略类名首字母小写，作为默认的ID值
 * id为person的bean的实力,如何指定ID的值
 * 2:.xml文件当中，告知spring自动扫描哪些包下面的component修饰的组件
 * **/
@Component(value="abc")
public class Person {
	public void eat() {
		System.out.println("人具有吃的方法");
	}
}
