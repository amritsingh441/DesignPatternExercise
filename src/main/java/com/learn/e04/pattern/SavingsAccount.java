package com.learn.e04.pattern;

import org.slf4j.Logger;

public class SavingsAccount implements Account {
	
	private static final Logger logger = LoggerInstanceSingelton.getInstance();

	@Override
	public void getAccountType() {
		
		logger.debug("inside Saving Account");
	}

}
