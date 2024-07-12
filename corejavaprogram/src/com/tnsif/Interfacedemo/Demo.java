package com.tnsif.Interfacedemo;

public class Demo implements Childinterface {

	@Override
	public void show() {
		System.out.println("show");
	}

	@Override
	public void print() {
		System.out.println("print");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Demo d= new Demo();
		d.show();
		d.print();
	}
	
	

}
