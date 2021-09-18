
public class OptionsMenuLoader {

	public static void main(String[] args) {
		
		OptionsMenu optionMenu = new OptionsMenu();
		
		Printer printer = new Printer();
		Scanner scanner = new Scanner();
		
		printerLandscapeCommand  printLandscape = new printerLandscapeCommand(printer);
		printerPotraitCommand printPotrait = new printerPotraitCommand(printer);
		cancelPrinterCommand cancelPrint = new cancelPrinterCommand(printer);
		
		scannerEmailCommand scannerEmail = new scannerEmailCommand(scanner);
		scannerPDFCommand scannerPDF = new scannerPDFCommand(scanner);
		scannerPrintCommand scannerPrint = new scannerPrintCommand(scanner);
		cancelScannerCommand cancelScanner = new cancelScannerCommand(scanner);
		
		optionMenu.setCommand(0, printLandscape, cancelPrint);
		optionMenu.setCommand(1, printPotrait, cancelPrint);
		optionMenu.setCommand(2, scannerEmail, cancelScanner);
		optionMenu.setCommand(3, scannerPDF, cancelScanner);
		optionMenu.setCommand(4, scannerPrint, cancelScanner);
		
		System.out.println(optionMenu);
		
		optionMenu.jobCommandExecute(0);
		System.out.println();
		optionMenu.cancelCommandExecute(0);
		System.out.println();
		optionMenu.jobCommandExecute(1);
		System.out.println();
		optionMenu.cancelCommandExecute(1);
		System.out.println();
		optionMenu.jobCommandExecute(2);
		System.out.println();
		optionMenu.cancelCommandExecute(2);
		System.out.println();
		optionMenu.jobCommandExecute(3);
		System.out.println();
		optionMenu.cancelCommandExecute(3);
		System.out.println();
		optionMenu.jobCommandExecute(4);
		System.out.println();
		optionMenu.cancelCommandExecute(4);
	}
}
