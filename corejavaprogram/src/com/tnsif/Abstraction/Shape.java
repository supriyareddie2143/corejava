package com.tnsif.Abstraction;

public abstract class Shape {
	protected  float area;
	//abstarct method
	abstract void calarea();//cpncrete class
	void show() {
		System.out.println("area of the square"+area);
	}

}
