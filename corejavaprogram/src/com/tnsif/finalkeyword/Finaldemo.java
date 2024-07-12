package com.tnsif.finalkeyword;

public class Finaldemo {
	final int x=10;
	static final int y;//cant be changed 
	//final method
  final   void change() {
	  System.out.println("default");
	}
     static {
    	 y=7;//can initailaze here but cant change 
     }

}
