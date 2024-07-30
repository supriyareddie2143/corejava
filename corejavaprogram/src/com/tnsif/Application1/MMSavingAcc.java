package com.tnsif.Application1;

import com.tnsif.Framework1.SavingAcc;

public class MMSavingAcc  extends SavingAcc{
	private float Minnal;



	public MMSavingAcc(int accno, String accnm, float accbal, boolean isSalaried) {
		super(accno, accnm, accbal, isSalaried);
	}


	public float getMinnal() {
		return Minnal;
	}

	public void setMinnal(float minnal) {
		Minnal = minnal;
	}

	@Override
	public void withdraw(float accbal) {
		System.out.println("Dear User,your balance"+getAccbal());
	}

	@Override
	public String toString() {
		return "MMSavingAcc [Minnal=" + Minnal + ", getMinnal()=" + getMinnal() + ", isSalaried()=" + isSalaried()
				+ ", getMinbal()=" + getMinbal() + ", toString()=" + super.toString() + ", getAccon()=" + getAccon()
				+ ", getAccnm()=" + getAccnm() + ", getAccbal()=" + getAccbal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

}
