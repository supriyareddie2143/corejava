package com.tnsif.Interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("inner interface");
		
	}
public static void main(String[] args) {
	Nestedinterface n =new Nestedinterface();
	n.print();
	System.out.println(Nestedinterface.id);
	
}
}
