package com.tnsif.Application;

import com.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	private float Charges;

	public GSPrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		super(accno, accnm, charges, isPrime);
	}

	@Override
	public void bookProducts(float charges) {
		
		System.out.println("user charges"+getCharges());
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [Charges=" + Charges + ", isPrime()=" + isPrime() + ", getDeliverycharges()="
				+ getDeliverycharges() + ", toString()=" + super.toString() + ", getAccno()=" + getAccno()
				+ ", getAccnm()=" + getAccnm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	
	

}
