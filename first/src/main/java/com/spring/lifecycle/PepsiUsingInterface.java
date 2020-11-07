package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PepsiUsingInterface implements InitializingBean,DisposableBean {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public PepsiUsingInterface() {
	super();
	// TODO Auto-generated constructor stub
}

public void afterPropertiesSet() throws Exception { // init() method as in xml configuration
	// TODO Auto-generated method stub
	System.out.println("init method");	
}

public void destroy() throws Exception { // destroy() method as in xml configuration
	// TODO Auto-generated method stub
	System.out.println("destroy method");	
}



}
