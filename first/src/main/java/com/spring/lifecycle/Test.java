package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/Lifecycleconfig.xml");
		Samosa s = (Samosa)context.getBean("s1");
		System.out.println(s);
		
		
		//here we are using AbstractApplicationContext because it has registerShutdownHook() method which calls destroy() method
		context.registerShutdownHook(); // calling destroy method
	}

}
