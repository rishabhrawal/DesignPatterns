package command;

/** The command for turning on the light ConcreteCommand #1 */
public class FlipUpCommand implements Command{
	
	private Light light;
	
	public FlipUpCommand(Light light){
		this.light = light;
	}
	
	@Override //Command
	public void execute(){ 
		light.turnOn();
	}
}
