package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;
//Demonstrate reduce program
public class Reducedemo {
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,2,3,4,5);
		//using reduce()to find the sum of the elements
		int sum=number.stream().reduce(0,(a,b)->a+b);
		System.out.println("sum of the elements "+sum);
		
	}

}
