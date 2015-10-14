package command;

/** Simulating pressing of the switch */
public class TestCommandPattern {
	
	public static void main(String[] args){
		if(args.length != 1){
			System.err.println("Argument \"On\" or \"Off\" is required.");
			System.exit(-1);
		}
		
		Light lamp = new Light();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);
		
		Switch mySwitch = new Switch();
		
		switch(args[0]){
		case "On" :
			mySwitch.storeAndExecute(switchUp);
		case "Off" :
			mySwitch.storeAndExecute(switchDown);
			
		default :
			System.err.println("Argument \"On\" or \"Off\" is required.");
			System.exit(-1);
			
		}
	}

}
