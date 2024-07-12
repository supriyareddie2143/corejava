package com.tnsif.helloo;

public class Child extends Father {
void Display() {
	System.out.println("dancing");
	
}
public static void main(String[] args) {
	Child c= new Child();
	c.Display();
}
}
