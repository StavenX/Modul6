package staven;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(SupportSystem.info());
		SupportSystem mySystem = new SupportSystem();
		
		mySystem.start();
		
	}
}
