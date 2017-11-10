package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;
/**
 * Class 
 *  
 * @author Ameshwari Om     
 * @author Lars Weingartner
 * @version 1.0
 *
 *
 */

public class SavingAccount extends BankAccount{

	/**
	 * Constructor that randomly set the account number as string with 6 chars, Balance sets to zero and accountType to "Saving Account"     
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * 
	 */	
	public SavingAccount(){
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}

	
}
