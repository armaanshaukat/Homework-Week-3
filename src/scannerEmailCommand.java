
public class scannerEmailCommand implements Command {

	Scanner scanner;
	
	public scannerEmailCommand(Scanner scanner) {
		this.scanner = scanner;
	}

	public void execute() {
		scanner.scannerOn();
		scanner.scannerEmail();
		scanner.scannerSleep();
	}
}