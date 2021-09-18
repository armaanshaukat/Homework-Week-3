
public class cancelScannerCommand implements Command {
	
	Scanner scanner;
	
	public cancelScannerCommand(Scanner scanner) {
			this.scanner = scanner;
	}
	
	public void execute() {
		scanner.cancelScan();
		scanner.scannerSleep();
	}
}