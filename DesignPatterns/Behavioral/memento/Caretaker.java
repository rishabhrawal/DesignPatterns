package memento;
import java.util.ArrayList;
import java.util.List;

// class that is responsible for creating the rollback points
public class Caretaker {
	public static void main(String [] args){
		List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();
		
		Originator originator = new Originator();
		originator.setState("State-1");
		originator.setState("State-2");
		
		originator.setState("State-3");
		savedStates.add(originator.saveToMemento()); //first rollback point
		
		originator.setState("State-5");
		
		originator.setState("State-4");
		savedStates.add(originator.saveToMemento());//second rollback point
		
		originator.restoreFromMemento(savedStates.get(0));
		

	}

}
