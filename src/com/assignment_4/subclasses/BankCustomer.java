package com.assignment_4.subclasses;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;
import java.util.ArrayList;

/**
 * Class
 * 
 * @author Ameshwari Om
 * @author Lars Weingartner
 * @version 1.0
 * 
 * 
 */

public class BankCustomer extends Human {

	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * Constructor
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * 
	 */
	public BankCustomer(int age, String name) {
		super(name, age);

	}

	/**
	 * 
	 * 
	 * @author Ameshwari Om
	 * @author Lars Weingartner
	 * @version 1.0
	 * 
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
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
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
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
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
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
	public void addAccount(BankAccount bankAccount) {
		this.customerAccounts.add(bankAccount);
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
	public void depositToAccount(String accountNumber, double amount) {
		if (amount < 0) {
			System.out.println("The amount must be greater than 0!");
		} else {
			for (int i = 0; i < customerAccounts.size(); i++) {
				if (customerAccounts.get(i).getAccountNumber()
						.equals(accountNumber)) {
					customerAccounts.get(i).depositMoney(amount);
				}
			}
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
	public void withdrawFromAccount(String accountNumber, double amount) {
		if (amount < 0) {
			System.out.println("The amount must be greater than 0!");
		} else {
			for (int i = 0; i < customerAccounts.size(); i++) {
				if (customerAccounts.get(i).getAccountNumber()
						.equals(accountNumber)) {
					customerAccounts.get(i).withdrawMoney(amount);
				}
			}
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
	@Override
	public String toString() {
		String s1 = "";
		int size = customerAccounts.size();
		for (int i = 0; i < size; i++) {
			s1 += "BankAccount: " + customerAccounts.get(i);
		}
		// System.out.println("customerAccount[1]" + customerAccounts.get(1));
		String s = "Customer: " + getName() + ", " + getAge() + "\n" + s1;
		return s;
	}
}
