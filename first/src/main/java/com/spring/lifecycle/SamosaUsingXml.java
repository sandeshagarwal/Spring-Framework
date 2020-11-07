package com.spring.lifecycle;

// There are three configuration techniques in Spring Lifecycle 
// Using Xml, Using Interface, Using Annotation

public class SamosaUsingXml {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public SamosaUsingXml() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void hello() // init() method
	{
		System.out.println("Inside init method : hello");
	}
	
	public void bye() //destroy method
	{
		System.out.println("Inside destroy method : bye");
	}
	
	// bean in config file, then first setter is called, then init, then toString, then destroy method is called in bean lifecycle 
}
