package Arraylist;

import java.util.ArrayList;

public class Arraylistdemo {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	System.out.println("size"+al.size());
	al.add(3);
	al.add(9.00);
	al.add("ramu");
	al.add('r');
	al.add(000.90);
	System.out.println("size"+al.size());
	System.out.println(al.contains(3));
	System.out.println(al.isEmpty());
	System.out.println(al.get(2));
	System.out.println(al.remove(3));
	
	
}
}
