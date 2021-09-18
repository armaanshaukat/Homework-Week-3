
public class OptionsMenu {
	
	Command[] jobCommands;
	Command[] cancelCommands;
	
	public OptionsMenu() {
		jobCommands = new Command [5];
		cancelCommands = new Command [5];
		
		Command noCommand = new NoCommand();
		
		for (int i = 0; i < 5; i++) {
			jobCommands[i] = noCommand;
			cancelCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command jobCommand, Command cancelCommand) {
		jobCommands[slot] = jobCommand;
		cancelCommands[slot] = cancelCommand;
	}
	
	public void jobCommandExecute(int slot) {
		jobCommands[slot].execute();
	}
	
	public void cancelCommandExecute(int slot) {
		cancelCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer stringB = new StringBuffer();
		stringB.append("\n---------- Printer Menu ----------\n");
		for (int i = 0; i < jobCommands.length; i++) {
			stringB.append("[Option " + i + "] " + jobCommands[i].getClass().getName() + "    " + cancelCommands[i].getClass().getName() + "\n");
		}
		return stringB.toString();
	}
}
