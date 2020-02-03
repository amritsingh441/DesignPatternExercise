package com.learn.e04.pattern;

public class AccountFactory {
	
	public Account getAccount(String accType) {
		
		if(accType.contains("Savings")) {
			return new SavingsAccount();
		}else if(accType.contains("Fixed")) {
			return new FixedAccount();
		} else if(accType.contains("Current")) {
			return new CurrentAccount();
		}
		return null;
	}

}
