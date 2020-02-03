package com.learn.e05.factorydemoclass;

import com.learn.e04.pattern.Account;
import com.learn.e04.pattern.AccountFactory;

public class FactoryPatternDemo {

	
	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();
		Account savingAcc = accountFactory.getAccount("Savings");
		savingAcc.getAccountType();
		Account currentAcc = accountFactory.getAccount("Current");
		currentAcc.getAccountType();
		Account fixedAcc = accountFactory.getAccount("Fixed");
		fixedAcc.getAccountType();
	}
}
