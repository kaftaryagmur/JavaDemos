
package reCapDemo6;

public class FileLogger extends BaseLogger {
	public void log(String message) { // overriding
		System.out.println("Logged to file: " + message);
	}
}
