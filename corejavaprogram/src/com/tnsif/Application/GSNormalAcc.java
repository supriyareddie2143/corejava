package com.tnsif.Application;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accno, String accnm, float charges, float delivarycharges) {
		super(accno, accnm, charges, delivarycharges);
	}

	@Override
	public void bookProducts(float charges) {
		System.out.println("user charges"+getCharges()+"delivery charges"+getDelivarycharges());
	}
 
}
