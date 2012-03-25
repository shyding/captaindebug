package com.captaindebug.payment;

import java.util.Date;

public class MasterCard implements PaymentMethod {

	private final String name;
	private final String cardNumber;
	private final Date expires;

	public MasterCard(String name, String cardNumber, Date expires) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.expires = expires;
	}

	@Override
	public boolean pay(double amount) {

		// Open Comms to Mastercard
		// Verify connection
		// Paybill using these details
		return true; // if payment goes through
	}

}
