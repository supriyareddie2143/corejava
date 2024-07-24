package Arraylist;

import java.util.LinkedList;

public class Linkedlistdemo {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("er");
	l.add("e");
	l.add(3);
	l.add(9.8);
	System.out.println("after involing adds()"+l);
	l.add(1,"apple");
	l.addFirst("d");
	l.addLast("teri");
	System.out.println(l);
	LinkedList l1=new LinkedList();
	l1.add(11);
	l1.add("da");
	l1.add(l);
	System.out.println(l1);
}
}
