package reCapDemo6;

public class EmailLogger extends BaseLogger {
	public void log(String message) { // overriding
		System.out.println("Logged to email: " + message);
	}
}
