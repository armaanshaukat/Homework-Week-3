
public class printerPotraitCommand {

	Printer printer;
	
	public printerPotraitCommand(Printer printer) {
		this.printer = printer;
	}
	
	public void execute() {
		printer.printOn();
		printer.printerPotrait();
		printer.printerSleep();
	}
	
	public void cancel() {
		printer.printerCancel();
		printer.printerSleep();
	}
}
