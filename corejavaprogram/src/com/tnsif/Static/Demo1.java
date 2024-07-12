package com.tnsif.Static;

public class Demo1 {
	public static void main(String[] args) {
		Student.change();
		Student s=new Student(453,"chandana");
		Student s2=new Student(525,"radha");
		Student s3=new Student(553,"rammma");
		s.display();
		s2.display();
		s3.display();
	}

}
