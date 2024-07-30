package com.tnsif.framework;

public interface Shopfactory {
	public PrimeAcc getPrimeAcc(int accno,String accnm , float charges ,boolean isprime );
	public NormalAcc getNormalAcc(int accno,String accnm,float charges, float deliverycharges);  

}
