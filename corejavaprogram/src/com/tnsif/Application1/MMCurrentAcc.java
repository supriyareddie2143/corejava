package com.tnsif.Application1;

import com.tnsif.Framework1.CurrentAcc;

public class MMCurrentAcc  extends CurrentAcc{

	public MMCurrentAcc(int accon, String accnm, float accbal, float creditLimit) {
		super(accon, accnm, accbal, creditLimit);
	}

	@Override
	public void withdraw(float accbal) {
		
	System.out.println("Dear User,balance"+getAccbal()+"credit limlit "+getCreditLimit());
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccon()=" + getAccon() + ", getAccnm()=" + getAccnm() + ", getAccbal()=" + getAccbal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
