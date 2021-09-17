
public class Scanner {
	
	public Scanner() {
	}
	
	public void scannerOn() {
		System.out.println("Scanner is getting ready to scan");
	}
	
	public void scannerSleep() {
		System.out.println("Scanner is going to sleep mode");
	}
	
	public void scannerPrint() {
		System.out.println("Printer is printing scan");
	}
	
	public void scannerPDF() {
		System.out.println("Downloading scan as a PDF file");
	}
	
	public void scannerEmail() {
		System.out.println("Scanner is getting ready to scan");
		System.out.println("Sending scan as PDF to entered destination e-mail");
	}
	
	public void cancelScan() {
		System.out.println("Cancelling scan job");
	}
}