package com.tnsif.finalllyblock;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("welcome");
		}
			catch(Exception e) {
				System.out.println("exception caught");
				
			}
			finally {
				System.out.println("finally block");
			}
		}
	}


