package com.tnsif.inheritance;

public class Citizen {

	private String name;
	private long adhaarno;
	private String address;
	private long phoneno;
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(String name, long adhaarno, String address, long phoneno) {
		super();
		this.name = name;
		this.adhaarno = adhaarno;
		this.address = address;
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdhaarno() {
		return adhaarno;
	}
	public void setAdhaarno(long adhaarno) {
		this.adhaarno = adhaarno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhaarno=" + adhaarno + ", address=" + address + ", phoneno=" + phoneno
				+ "]";
	}
	
	
}
