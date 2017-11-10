package com.assignment_4.subclasses;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class BankCustomer to handle the customers and there accounts
 * 
 * @author Ameshwari Om
 * @author Lars Weingartner
 * @version 1.0
 * 
 */

public class BankCustomer extends Human {

	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * Constructor using the superclass Human
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param age the age of the customer
	 * @param name the customer's name
	 */
	public BankCustomer(int age, String name) {
		super(name, age);

	}

	/**
	 * Constructor using the superclass Human 
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param age the age of the customer
	 * @param name the customer's name
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}

	/**
	 * Getter for the customer's accounts
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * @return customerAccounts an arrayList with with the customers accounts 
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * setter for the customer's account
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param customerAccounts to set in the customer's accountList
	 *
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/**
	 * AddAccount() adds an account to the customers accounts
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param bankAccount the account to add to the customers accounts
	 * 
	 */
	public void addAccount(BankAccount bankAccount) {
		this.customerAccounts.add(bankAccount);
	}

	/**
	 * depositToAccount adding amount to the balance of the customer's account. If the amount to deposit are less than zero, a message will
	 *  ask the user to insert a new amount.
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param accountNumber the account number to add to
	 * @param amount the amount to add to the customer's account
	 * 
	 */
	public void depositToAccount(String accountNumber, double amount) {
		while (amount < 0) {
			System.out.println("The amount must be greater than 0!");
			Scanner sc = new Scanner(System.in);
			amount = sc.nextDouble();
			sc.close();
		}
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber()
					.equals(accountNumber)) {
			customerAccounts.get(i).depositMoney(amount);
			}
		}
	}

	/**
	 * withdrawFromAccount subtract amount from the balance of the customer's account. If the amount to withdraw are less than zero, a message will
	 *  ask the user to insert a new amount.
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param accountNumber the account number to withdraw from
	 * @param amount the amount to withdraw from the customer's account
	 *
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		while (amount < 0) {
			System.out.println("The amount must be greater than 0!");
			Scanner sc = new Scanner(System.in);
			amount = sc.nextDouble();
			sc.close();
		}
		for (int i = 0; i < customerAccounts.size(); i++) {
				if (customerAccounts.get(i).getAccountNumber()
						.equals(accountNumber)) {
					customerAccounts.get(i).withdrawMoney(amount);
				}
			
		}
	}

	/**
	 * Method toString returns a string with formated information about the customer's name, ageand account information
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * @return s the string with formated information
	 */
	@Override
	public String toString() {
		String s = "Customer: " + getName() + ", " + getAge() + "\n";		
		
		
		for (int i = 0; i < customerAccounts.size(); i++) {
		//	s += "BankAccount: " + customerAccounts.get(i);
			s += customerAccounts.get(i);//.toString();
		}
	
		return s;
	}
}
