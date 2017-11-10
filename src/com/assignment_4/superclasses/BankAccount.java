package com.assignment_4.superclasses;


import java.util.UUID;
import com.assignment_4.interfaces.BankOperations;
/**
 * Class 
 *  
 * @author Ameshwari Om     
 * @author Lars Weingartner
 * @version 1.0
 *
 *
 */

public class BankAccount implements BankOperations{
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;

	/**
	 * Constructor that randomly set the account number as string with 6 chars, Balance sets to zero and accountType to "Bank Account"    
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * 
	 */	
	public BankAccount(){
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0.0;
		this.accountType = "Bank account";
	}
	
    /**
     * getter for account number
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @return accountNumber the account number
     */	
	public String getAccountNumber() {
		return accountNumber;
	}
	
    /**
     * setter for account number
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param accountNumber the account number
     * 
     */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
    /**
     * getter for account type
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @return accountType the account type
     */
	public String getAccountType() {
		return accountType;
	}
	
    /**
     * setter for account type
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param accountType The type of account
     * 
     */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
    /**
     * getter for balance
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @return balance the accounts balance to get
     */
	public double getBalance() {
		return balance;
	}
	
    /**
     * setter for balance
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param balance the accounts balance to get
     * 
     */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
    /**
     * withdraw amount from balance
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param amount to withdraw from balance
     * 
     */
	public void withdrawMoney(double amount) {
		if(balance >= 0){
			setBalance(getBalance() - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}
	}
	
    /**
     * depositMoney add amount to balance 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param amount to set the balance
     * 
     */
	public void depositMoney(double amount) {
		setBalance(getBalance() + amount);	
	}
	
    /**
     * Method for getting account information in a readable string 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @return s a formated string with account number, balance and account type
     */
	@Override
	public String toString(){
		String s = "[accountnumber = " + getAccountNumber() + ", balance = " + getBalance() + ", accountType = " + getAccountType() + "]\n"; 
		return s;
	}
}

	
	
	
	
	
	
	
	