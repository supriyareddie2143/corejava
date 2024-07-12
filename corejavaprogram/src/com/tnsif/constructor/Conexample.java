package com.tnsif.constructor;

public class Conexample {
	Conexample(){
		System.out.println("default cpnstructor");
	}
Conexample(int i)
{
	System.out.println("welcome");
}
Conexample(int i, int j)
{
	System.out.println("hello chananaaa unavaa");
}
Conexample(int i,String n)
{
	System.out.println("differrent types");
}
public static void main(String[] args) {
	Conexample c1=new Conexample();
	Conexample c2=new Conexample(4);
	Conexample c3=new Conexample(9,"r");

}
}
