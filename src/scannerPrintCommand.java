
public class scannerPrintCommand implements Command {

	Scanner scanner;
	
	public scannerPrintCommand(Scanner scanner) {
		this.scanner = scanner;
	}

	public void execute() {
		scanner.scannerOn();
		scanner.scannerPrint();
		scanner.scannerSleep();
	}
}