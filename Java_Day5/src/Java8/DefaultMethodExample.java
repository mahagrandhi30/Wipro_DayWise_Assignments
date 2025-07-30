package Java8;

public class DefaultMethodExample {

	public static void main(String[] args) {
		Device tv = new TV();
		tv.turnOn();
		tv.reset();
		tv.turnOff();
		
		System.out.println();
		
		Device radio = new Radio();
		radio.turnOn();
		radio.reset();
		radio.turnOff();

	}

}
