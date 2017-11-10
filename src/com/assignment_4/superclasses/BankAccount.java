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
	String accountNumber = "";
	String accountType = "";
	double balance = 0.0;

	/**
	 * Constructor     
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
     * Method 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param
     * @return 
     */	
	public String getAccountNumber() {
		return accountNumber;
	}
	
    /**
     * Method 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param
     * @return 
     */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
    /**
     * Method 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param
     * @return 
     */
	public String getAccountType() {
		return accountType;
	}
	
    /**
     * Method 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param
     * @return 
     */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
    /**
     * Method 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param
     * @return 
     */
	public double getBalance() {
		return balance;
	}
	
    /**
     * Method 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param
     * @return 
     */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
    /**
     * Method 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param
     * @return 
     */
	public void withdrawMoney(double amount) {
		if(balance >= 0){
			setBalance(getBalance() - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}
	}
	
    /**
     * Method 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param
     * @return 
     */
	public void depositMoney(double amount) {
		setBalance(getBalance() + amount);	
	}
	
    /**
     * Method 
     *
     * @author Ameshwari Om    
     * @author Lars Weingartner
     * @version 1.0
     * @param
     * @return 
     */
	@Override
	public String toString(){
		String s = "[accountnumber = " + getAccountNumber() + ", balance = " + getBalance() + ", accountType = " + getAccountType() + "]\n"; 
		return s;
	}
}

	
	
	
	
	
	
	
	