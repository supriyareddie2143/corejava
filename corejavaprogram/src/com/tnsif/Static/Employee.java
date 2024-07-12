package com.tnsif.Static;

public class Employee {
	int eid;
	String name;
	static String company="tNS";
	Employee(int r,String n){
	eid=r;
	name=n;
	}
	void display(){
		System.out.println(eid+"  "+name+"  "+company);
		
	}
	
}
