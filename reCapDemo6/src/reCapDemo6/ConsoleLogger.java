package reCapDemo6;

public class ConsoleLogger extends BaseLogger {
	public void log(String message) { // overriding
		System.out.println("Logged to console: " + message);
	}
}
