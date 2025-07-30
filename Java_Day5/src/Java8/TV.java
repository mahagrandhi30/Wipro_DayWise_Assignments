package Java8;

public class TV implements Device{

	@Override
	public void turnOn() {
		System.out.println("TV is ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV is OFF");
	}
	

}
