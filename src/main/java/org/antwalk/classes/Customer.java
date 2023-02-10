package org.antwalk.classes;

import org.antwalk.interfaces.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cus")
public class Customer {
	
	private String name;
	private String username;
	private String password;
	private int age;
	private String ssn;
	private String address;
	private String email;
	private long phone;
	private double balance;
	
	private String typeOfAcc;
	
	
	@Autowired
	@Qualifier("current")
	Account acc1;
	
	@Autowired
	@Qualifier("saving")
	Account acc2;
	
	public void login(String username, String password) {
		this.username = username;
		this.password = password;
		System.out.println("LOGGED IN SUCCESSFULLY\n");
	}
	
	public void viewProfile() {
		System.out.println("\n**********USER PROFILE********");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		System.out.println("SSN No: " + ssn);
	}
	
	public void type(String s) {
		if(s.equals("c"))
			typeOfAcc = "current";
		else
			typeOfAcc = "saving";
	}
	
	public void deposit(double amt) {
		balance += amt;
		System.out.println("Amount deposited");
	}
	
	public void withdraw(double amt) {
		if(balance < amt)
			System.out.println("Not enough balance");
		else {
			balance -= amt;
			System.out.println("Amount withdrawn");
		}
		
	}
	
	public void getBalance() {
		System.out.println("\n-------------ACCOUNT DETAILS-----------");
		if(typeOfAcc.equals("current"))
			acc1.showAccount();
		else
			acc2.showAccount();
		
		System.out.println("Balance: " + balance);
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
		
	
	
}

