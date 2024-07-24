package com.tnsif.setdemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//demo for set 
public class Setoperations {
	public static void operations() {
		Set<Integer>n= new HashSet<Integer>();
		n.add(4);
		n.add(2);
		n.add(8);
		n.add(9);
		System.out.println(n);
		n.addAll(Arrays.asList(new Integer[] {1,2,3}));
		System.out.println(n);
		System.out.println(n.size());
		Set<Integer>oddset=new HashSet<Integer>();
		oddset.addAll(Arrays.asList(new Integer[] {3,4,5}));
		System.out.println("oddset"+oddset);
		Set<Integer> intersection =new HashSet<>(n);
		intersection.retainAll(intersection);
		
	}

}
