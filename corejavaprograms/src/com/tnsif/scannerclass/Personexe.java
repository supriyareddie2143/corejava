package com.tnsif.scannerclass;

import java.util.Scanner;

public class Personexe {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the person name ");
		String name=sc.nextLine();
			System.out.println("enter the person income");
		int income= sc.nextInt();
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);

	Taxcalculation t =new Taxcalculation();
	t.calculateTax(pp);
	System.out.println("after modification");
	System.out.println(pp);
	}

}
