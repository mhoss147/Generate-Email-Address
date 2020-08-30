package emailApp;

public class EmailApp {

	public static void main(String[] args) {

		Email email1 = new Email("Moh", "Hoss");
		
		// Email email2 = new Email("Mub", "Taj");
		
		// setAlternateEmail and getAlternateEmail in action
		// email1.setAlternateEmail("mhoss@gmail.com");
		// System.out.println("Your Alternate Email is: " + email1.getAlternateEmail());
		
		System.out.println(email1.showInfo());
		
		// System.out.println(email2.showInfo());
		
		
	}

}
