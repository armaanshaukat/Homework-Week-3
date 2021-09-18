
public class printerLandscapeCommand implements Command {
	
	Printer printer;
	
	public printerLandscapeCommand(Printer printer) {
		this.printer = printer;
	}
	
	public void execute() {
		printer.printOn();
		printer.printerLandscape();
		printer.printerSleep();
	}
}