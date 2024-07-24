package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgenerics {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("rohit");
	al.add("gahjhhwchi");
	al.add("rhgkjrk");
	//al.add(8);
	System.out.println("elemnts"+al);
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

	
}
}
