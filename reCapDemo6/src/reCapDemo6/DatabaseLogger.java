
package reCapDemo6;

public class DatabaseLogger extends BaseLogger {
	public void log(String message) { // overriding
		System.out.println("Logged to database: " + message);
	}
}
