package com.tnisf.Collection;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		System.out.println("size of the vector"+v.size());

		v.add("red");
		v.add("yelllow");
		v.add("blue");
		v.add("black");
		v.add("orange");
		int capacity =v.capacity();
		System.out.println(capacity);
		v.add(6,"red");
		System.out.println(v);
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		System.out.println(capacity);
	}

}
