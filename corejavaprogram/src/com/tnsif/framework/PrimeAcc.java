package com.tnsif.framework;

public  abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private float deliverycharges=0;
	

	public PrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		super(accno, accnm, charges);
		this.isPrime = isPrime;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public float getDeliverycharges() {
		return deliverycharges;
	}

	public void setDeliverycharges(float deliverycharges) {
		this.deliverycharges = deliverycharges;
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", deliverycharges=" + deliverycharges + "]";
	}

	@Override
	public void bookProducts(float charges) {

		
	}

		
	}
	


