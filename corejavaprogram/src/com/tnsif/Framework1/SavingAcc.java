package com.tnsif.Framework1;

public class SavingAcc  extends BankAcc{
	private boolean isSalaried;
	private float Minbal;
	public SavingAcc(int accno, String accnm, float accbal, boolean isSalaried) {
		super(accno, accnm, accbal);
		this.isSalaried = isSalaried;
	}
	
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	public float getMinbal() {
		return Minbal;
	}
	public void setMinbal(float minbal) {
		Minbal = minbal;
	}

	@Override
	public void withdraw(float accbal) {
		
		super.withdraw(accbal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", Minbal=" + Minbal + "]";
	}
	

}
