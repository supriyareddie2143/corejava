package com.tnsif.helloo;
public class nestint implements Innerinterfacee.myinnerinterface{
	public void jump()
	{
		System.out.println("runn  " +i);
		
	}
	public static void main(String[] args) {
		nestint ns=new nestint();
		ns.jump();
		System.out.println(nestint.i);
	}

}
