package com.tnsif.exceptiondemo;

public class Nestedtrycatch {
	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("string length"+slength);
		String anotherstring=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex)
			{
				System.out.println("Index OUt of Bound EXception"+ex.getMessage());
			}
			System.out.println("String Length"+anotherstring.length());
			
		}
		catch(NullPointerException n) {
			System.out.println("exception is thrown"+n.getMessage());
			
		}
	}

}
