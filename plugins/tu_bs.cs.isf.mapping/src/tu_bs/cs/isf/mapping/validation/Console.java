package tu_bs.cs.isf.mapping.validation;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;


public class Console {

	public static final String CONSOLE = "mapping_output_console";

	private static MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   }
	
	public static MessageConsole findConsole() {
		return findConsole(CONSOLE);
	}
	
	public static void println(Object message) {
		if (message == null) {
			message = new String("null");
		} else {
			MessageConsoleStream out = findConsole().newMessageStream();
			out.println("" + message);
		}
	}

	public static void println() {
		MessageConsoleStream out = findConsole().newMessageStream();
		out.println();
	}

}
