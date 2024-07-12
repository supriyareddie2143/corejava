package com.tnsif.inheritance;

public class Student extends Citizen{
	private int rollno;
	private String collegename;
	public Student() {
		System.out.println("welcome");
		
		
	}
	public Student(int rollno, String collegename) {
		this.rollno = rollno;
		this.collegename = collegename;
	}
	public Student(String name, long adhaarno, String address, long phoneno) {
		super(name, adhaarno, address, phoneno);
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return super.toString()+ "Student [rollno=" + rollno + ", collegename=" + collegename + "]";
	}
	
	

}
