package com.first.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.first.collections.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/first/references/referenceconfig.xml");
		A a1 =(A) context.getBean("aref");
		System.out.println(a1);
		System.out.println(a1.getOb().getY());
	}

}
