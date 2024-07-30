package com.tnsif.framework;

public abstract class NormalAcc extends ShopAcc {
public float getDelivarycharges() {
		return delivarycharges;
	}
	public void setDelivarycharges(float delivarycharges) {
		this.delivarycharges = delivarycharges;
	}
private float delivarycharges;

public NormalAcc(int accno, String accnm, float charges, float delivarycharges) {
	super(accno, accnm, charges);
	this.delivarycharges = delivarycharges;
}

@Override
public String toString() {
	return "NormalAcc [delivarycharges=" + delivarycharges + "]";
}
@Override
public void bookProducts(float charges) {
	
	
}



}