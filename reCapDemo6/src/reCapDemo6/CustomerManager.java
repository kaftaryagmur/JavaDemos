<<<<<<< HEAD
package reCapDemo6;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
	}

	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("Log mesajı ");
	}
}
=======
package reCapDemo6;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
	}

	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("Log mesajı ");
	}
}
>>>>>>> 6a6f35683c30af64c6c69cbae018cdcd82d307c2
