package com.tnsif.Application;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.Shopfactory;

public class GSShopFactory implements Shopfactory {

	@Override
	public PrimeAcc getPrimeAcc(int accno, String accnm, float charges, boolean isprime) {
		PrimeAcc primeAcc =  new GSPrimeAcc(accno,accnm,charges,isprime);
		return primeAcc;
	}

	@Override
	public NormalAcc getNormalAcc(int accno, String accnm, float charges, float deliverycharges) {
		NormalAcc normalAcc = new GSNormalAcc(accno,accnm,charges,deliverycharges);
		return normalAcc;
	}
	

}
