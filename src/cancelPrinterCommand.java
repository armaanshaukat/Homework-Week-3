
public class cancelPrinterCommand implements Command {
	
	Printer printer;
	
	public cancelPrinterCommand(Printer printer) {
		this.printer = printer;
	}
	
	public void execute() {
		printer.printerCancel();
		printer.printerSleep();
	}
}