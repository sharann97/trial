package com.training.userdefined;

import com.training.basics.Bank;

public class ExceedingLinitsException extends Exception {

	public ExceedingLinitsException() {
		super();
	}

	public ExceedingLinitsException(String message) {
		super(message);
		Bank ref=new Bank();	}


}
