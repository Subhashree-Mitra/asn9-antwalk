package org.antwalk;

import java.util.Scanner;

import org.antwalk.classes.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer c = context.getBean("cus",Customer.class);
		
		System.out.println("Enter Credentials: ");
		System.out.println("Username: ");
		String usr = sc.nextLine();
		System.out.println("Password: ");
		String pass = sc.nextLine();
		
		c.login(usr, pass);
		
		System.out.println("Enter profile info");
		System.out.println("Name: ");
		c.setName(sc.nextLine());
		System.out.println("Age: ");
		c.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Address: ");
		c.setAddress(sc.nextLine());
		System.out.println("Email: ");
		c.setEmail(sc.nextLine());
		System.out.println("Phone: ");
		c.setPhone(sc.nextLong());
		sc.nextLine();
		System.out.println("SSN: ");
		c.setSsn(sc.nextLine());
		
		c.viewProfile();
		
		System.out.println("\nEnter the type of account you wanna open: ");
		System.out.println("Type c for current OR s for saving");
		
		c.type(sc.nextLine().toLowerCase());
		
		System.out.println("Enter the amount you wanna deposit: ");
		c.deposit(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Enter the amount you wanna withdraw: ");
		c.withdraw(sc.nextDouble());
		sc.nextLine();
		
		c.getBalance();
		
	}

}
