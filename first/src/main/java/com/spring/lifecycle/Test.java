package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/Lifecycleconfig.xml");
//		SamosaUsingXml s = (SamosaUsingXml)context.getBean("s1");
//		System.out.println(s);
		
		
		//here we are using AbstractApplicationContext because it has registerShutdownHook() method which calls destroy() method
		context.registerShutdownHook(); // calling destroy method
//		
//		System.out.println("------------------------------------ Using Interface configuration technique --------------------------------------");
//		//AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("com/spring/lifecycle/Lifecycleconfig.xml");
//		PepsiUsingInterface p = (PepsiUsingInterface)context.getBean("p1");
//		System.out.println(p);
		//context1.registerShutdownHook(); 
		
		System.out.println("------------------------------------ Using Annotation configuration technique --------------------------------------");		
		ExampleUsingAnnotations e = (ExampleUsingAnnotations)context.getBean("e1");
		System.out.println(e);
	}

}
