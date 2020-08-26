package emailApp;

import java.lang.reflect.Constructor;

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
		
	}
	
	
	
	
	// Ask for the department
	
	
	// Generate the random password
	

	// Set the mailbox capacity
	
	
	// Set the alternate email
	
	
	// Change the password


	
	

}
