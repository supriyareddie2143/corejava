package com.tnsif.Application1;
import com.tnsif.Framework1.BankFactory;
import com.tnsif.Framework1.CurrentAcc;
import com.tnsif.Framework1.SavingAcc;

public class MMBankFactory  implements BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accno, String accnm, float accbal, boolean isSalaried) {
		SavingAcc sa=new MMSavingAcc(accno,accnm,accbal,isSalaried);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accno, String accnm, float accbal, float creditlimit) {
	CurrentAcc ca=new MMCurrentAcc(accno,accnm,accbal,creditlimit);
		return ca;
	}
}
