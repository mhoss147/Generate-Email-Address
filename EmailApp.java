package emailApp;

public class EmailApp {

	public static void main(String[] args) {

		Email email1 = new Email("Moh", "Hoss");
		
		
		// setAlternateEmail and getAlternateEmail in action
		email1.setAlternateEmail("mhoss@gmail.com");
		System.out.println("Your Alternate Email is: " + email1.getAlternateEmail());
		
	}

}
