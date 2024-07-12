package com.tnsif.throwexample;

import java.util.Scanner;

public class Testdemo {
	//throw keyword
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				System.out.println("enter the roll no");
		int rollno=sc.nextInt();
		if(rollno<0)
		{
			System.out.println("rollno cant be zero");
		}
		else {
			System.out.println("valid rollno");
		}
	}

}
