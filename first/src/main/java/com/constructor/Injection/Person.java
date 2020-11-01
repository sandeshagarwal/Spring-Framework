package com.constructor.Injection;

import java.util.List;

public class Person {
	
	private String name;
	private int id;
	private Certi certi;
	private List list;
	
	@Override
	public String toString() {
		return this.name+" , "+this.id +"{"+this.certi.name+"}"+this.list;
	}
	//using references as certificate
	public Person(String name, int id,Certi certi,List<String>list) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
		this.list = list;
	}

}
