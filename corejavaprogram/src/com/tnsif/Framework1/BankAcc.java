package com.tnsif.Framework1;

public abstract class BankAcc {
	private int accon;
	private String accnm;
	private float accbal;
	public BankAcc(int accon, String accnm, float accbal) {
		super();
		this.accon = accon;
		this.accnm = accnm;
		this.accbal = accbal;
	}
	public int getAccon() {
		return accon;
	}
	public void setAccon(int accon) {
		this.accon = accon;
	}
	public String getAccnm() {
		return accnm;
	}
	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}
	public float getAccbal() {
		return accbal;
	}
	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}
	@Override
	public String toString() {
		return "BankAcc [accon=" + accon + ", accnm=" + accnm + ", accbal=" + accbal + ", getAccon()=" + getAccon()
				+ ", getAccnm()=" + getAccnm() + ", getAccbal()=" + getAccbal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void withdraw(float accbal) {
		
	}
	public void deposite(float accbal) {
		
	}

}
