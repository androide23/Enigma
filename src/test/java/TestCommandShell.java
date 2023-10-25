import enigma.shells.commandline.CommandLineShell;

public class TestCommandShell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(System.getProperty("java.home"));
		CommandLineShell shell = new CommandLineShell();
		shell.runShell();
	}

}
