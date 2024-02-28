<<<<<<< HEAD
package reCapDemo6;

public class Main {
	public static void main(String[] args) {
		// BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new
		// EmailLogger(), new DatabaseLogger(),
		// new ConsoleLogger() };
		// for (BaseLogger logger : loggers) {
		// logger.Log("Log mesajı");
		// }
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
=======
package reCapDemo6;

public class Main {
	public static void main(String[] args) {
		// BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new
		// EmailLogger(), new DatabaseLogger(),
		// new ConsoleLogger() };
		// for (BaseLogger logger : loggers) {
		// logger.Log("Log mesajı");
		// }
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
>>>>>>> 6a6f35683c30af64c6c69cbae018cdcd82d307c2
