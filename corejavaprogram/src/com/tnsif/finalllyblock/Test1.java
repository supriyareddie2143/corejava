package com.tnsif.finalllyblock;

public class Test1 {
	public static void main(String[] args) {
		try
		{
			System.out.println(100/0);
		}
		catch(ArithmeticException a) {
			System.out.println("exception"+a.getMessage());
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
