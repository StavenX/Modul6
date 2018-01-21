package staven;

/**
 * Main class that executes the support system.
 * 
 * @author Edvin Myhren
 * @version 1.0
 */

public class Main {

	public static void main(String[] args) {
		
		System.out.println(SupportSystem.info());
		SupportSystem mySystem = new SupportSystem();
		
		mySystem.start();
		
	}
}
