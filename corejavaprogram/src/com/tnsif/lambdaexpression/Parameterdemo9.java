package com.tnsif.lambdaexpression;

public class Parameterdemo9 {
public static void main(String[] args) {
	Cube c=(a)->{return (a*a*a);};
	System.out.println("cube of a num  "+c.calculate(3));
}
}
