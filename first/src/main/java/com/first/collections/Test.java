package com.first.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/first/collections/collectionconfig.xml");
		Emp e1 =(Emp) context.getBean("emp1");
		System.out.println(e1.getName());
		System.out.println(e1.getAddress());
		System.out.println(e1.getPhones());
		System.out.println(e1.getCourses());
		System.out.println(e1.getProps());
	}

}
