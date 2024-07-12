package com.tnsif.overriding;

public class Child extends Father {
	public void drinking(){
		System.out.println("booast");
		
	}
	public static void main(String[] args) {
		Child c =new Child();
		c.drinking();
	}
		
	}


