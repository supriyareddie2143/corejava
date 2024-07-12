package com.tnsif.finalllyblock;

public class Test2 {//exception with no matching catch block
	public static void main(String[] args) {
		try
		{
			System.out.println(787/0);
		}
		catch(NullPointerException n) {
			System.out.println("exception caugght"+n.getMessage());
		}
		finally
		{
			System.out.println("exception with no catch block");
		}
	}

}
