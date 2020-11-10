package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiring/AutoWiringconfig.xml");
		Emp e = context.getBean("emp1",Emp.class);
		System.out.println(e);
	}

}
