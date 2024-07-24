package com.tnsif.lambdaexpression;

public class LambdaDemo {
 public static void main(String[] args) {
	Message m=()->{return "hello world:";};
	System.out.println(m.greet());
	}
}
