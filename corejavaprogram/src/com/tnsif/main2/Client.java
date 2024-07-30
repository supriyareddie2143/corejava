package com.tnsif.main2;

import com.tnsif.Application1.MMBankFactory;
import com.tnsif.Application1.MMCurrentAcc;
import com.tnsif.Application1.MMSavingAcc;

public class Client {
public static void main(String[] args) {
	MMBankFactory bf=new MMBankFactory();
	//creating a saving account
	MMSavingAcc bm=(MMSavingAcc)bf.getNewSavingAcc(6, "radha", 675867.0f, true);
	bm.withdraw(bm.getAccbal());
	//creating a current account
	MMCurrentAcc cm=(MMCurrentAcc)bf.getNewCurrentAcc(7, "supriya", 775.0f,50000.0f );
	cm.withdraw(cm.getCreditLimit());
	
}
}
