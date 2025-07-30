package Java8;

public interface Device {
	void turnOn();
	void turnOff();
	
	default void reset() {
		System.out.println("Device is resetting....");
	}
}
