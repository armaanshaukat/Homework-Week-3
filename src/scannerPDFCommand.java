
public class scannerPDFCommand implements Command {

	Scanner scanner;
	
	public scannerPDFCommand(Scanner scanner) {
		this.scanner = scanner;
	}

	public void execute() {
		scanner.scannerOn();
		scanner.scannerPDF();
		scanner.scannerSleep();
	}
}