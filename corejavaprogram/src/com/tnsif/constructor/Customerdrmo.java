package com.tnsif.constructor;

import java.util.Scanner;

public class Customerdrmo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your cid");
		int id=sc.nextInt();
		System.out.println("enter the address");
		String add=sc.nextLine();
		Customer c =new Customer();
		c.setCname(name);
		c.setCid(id);
		c.setCaddress(add);
		System.out.println(c);
		boolean out=c instanceof Customer;
		System.out.println(out);
	}

}
