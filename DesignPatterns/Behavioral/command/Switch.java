package command;

import java.util.ArrayList;
import java.util.List;

/** The Invoker class **/
public class Switch {
	private List<Command> history = new ArrayList<Command>();
	
	public void storeAndExecute(Command command){
		history.add(command); //Optional
		command.execute();
	}
	
}
