package Java8;

public class Radio implements Device {

	@Override
	public void turnOn() {
		System.out.println("Radio is ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio is OFF");
		
	}
	public void rest() {
		System.out.println("Radio is resetting...");
	}

}
