package com.tnsif.Framework1;

public class CurrentAcc  extends BankAcc{
private float creditLimit;

public CurrentAcc(int accon, String accnm, float accbal, float creditLimit) {
	super(accon, accnm, accbal);
	this.creditLimit = creditLimit;
}

public float getCreditLimit() {
	return creditLimit;
}

public void setCreditLimit(float creditLimit) {
	this.creditLimit = creditLimit;
}

@Override
public void withdraw(float accbal) {
	super.withdraw(accbal);
}

@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + "]";
}

}
