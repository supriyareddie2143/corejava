package com.tnsif.main;

import com.tnsif.Application.GSNormalAcc;
import com.tnsif.Application.GSPrimeAcc;
import com.tnsif.Application.GSShopFactory;

public class Client {
public static void main(String[] args) {
	GSShopFactory obj= new GSShopFactory();
	//creation of prime account
	GSPrimeAcc ga= (GSPrimeAcc)obj.getPrimeAcc(1,"java",599.0f,true);
	ga.bookProducts(ga.getCharges());
			
GSNormalAcc ge=(GSNormalAcc)obj.getNormalAcc(2,"python",699.0f,99.00f);
         ge.bookProducts(ge.getCharges());
}
}
