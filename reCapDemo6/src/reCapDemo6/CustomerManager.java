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
