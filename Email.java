package emailApp;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Email {
	
	// Private variables, don't want anyone to access!
	
	private String firstName; 
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;
	
	
	// Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName) {
		
		// this refer to class level variables and other one is local
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		// Print to console		
		System.out.println("Email created: "+ this.firstName + " " + this.lastName);
		
		
		// Call a method asking for dept and return the dept
		this.department = setDepartment();		
		
	}
	
	
	
	
	// Ask for the department, Don't want a public method
	private String setDepartment() {
		
		System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		
		// Read the input		
		Scanner in = new Scanner(System.in);
		
		int deptChoice = in.nextInt();
		
		if (deptChoice == 1) { return "Sales";}
		else if (deptChoice == 2) { return "Development"; }
		else if (deptChoice == 3) { return "Accounting"; }
		else {	return ""; }
		
		
	}
	
	
	// Generate the random password
	

	// Set the mailbox capacity
	
	
	// Set the alternate email
	
	
	// Change the password


	
	

}
