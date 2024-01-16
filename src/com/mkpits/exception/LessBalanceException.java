package com.mkpits.exception;

public class LessBalanceException extends Exception {
	int amount;

	public LessBalanceException() {
		System.out.println("Default Constructor Called");
	}

	public LessBalanceException(int amount) {
		this.amount = amount;

	}
// Always in String to print user exception it is a by Default Method..
	@Override
	public String toString() {
		return "You Dont Have Sufficient Balance Your Balance is " + amount;
	}
}