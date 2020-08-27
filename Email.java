package emailApp;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Email {
	
	// Private variables, don't want anyone to access!
	
	private String firstName; 
	private String lastName;
	private String email;
	private String password;
	private int passwordLength = 8;
	private String department;
	private String companySuffix = "mohcompany.com";
	private int mailBoxCapacity;
	private String alternateEmail;
	
	
	// Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName) {
		
		// this refer to class level variables and other one is local
		
		this.firstName = firstName;
		this.lastName = lastName;	
		
		// Print to console		
		System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName + "\n");
		
		
		// Call a method asking for dept and return the dept
		this.department = setDepartment();	
		System.out.println("Department: " + this.department);
		
		
		
		// Call a method that returns a random password
		this.password = randomPassword(passwordLength);
		System.out.println("Your passwoerd is: " + this.password);
		
		
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
		System.out.println("Your Email is: " + email);
		
		
		
		
		
		
		
	}
	
	
	
	
	// Ask for the department (Don't want a public method) and define it
	private String setDepartment() {
		
		System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n\nEnter the department: ");
		
		// Read the input		
		Scanner in = new Scanner(System.in);
		
		int deptChoice = in.nextInt();
		
		if (deptChoice == 1) { return "Sales";}
		else if (deptChoice == 2) { return "Development"; }
		else if (deptChoice == 3) { return "Accounting"; }
		else {	return ""; }
	}

	
	// Private Method to generate random password
	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ012345678!@#$%";
		
		char[] password = new char[length];
		
		for (int i = 0; i < password.length; i++) {
			
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
					
		}
		
		return new String(password);
		
	}
	
	
	
	
	// Generate the random password
	

	// Set the mailbox capacity
	
	
	// Set the alternate email
	
	
	// Change the password


	
	

}
