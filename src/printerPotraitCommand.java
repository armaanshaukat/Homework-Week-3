
public class printerPotraitCommand implements Command {

	Printer printer;
	
	public printerPotraitCommand(Printer printer) {
		this.printer = printer;
	}
	
	public void execute() {
		printer.printOn();
		printer.printerPotrait();
		printer.printerSleep();
	}
}
