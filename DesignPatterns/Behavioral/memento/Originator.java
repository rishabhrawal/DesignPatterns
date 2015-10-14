package memento;

public class Originator {
	private String state;
	
	public void setState(String state){
		System.out.println("Originator: Setting state to " + state);
		this.state = state;
	}
	
	// state is saved to a Memento object and returned
	public Memento saveToMemento(){
		System.out.println("Originator: Saving state to Memento ");
		return new Memento(this.state);
	}
	
	// state is restored from the Memento object
	public void restoreFromMemento(Memento memento){
		this.state =  memento.getSavedState();
		System.out.println("Originator: Restoring state from Memento "+state);
	}
	
	
	// static class to hold the state of Originator
	public static class Memento{
		private final String state;
		
		public Memento(String stateToSave){
			this.state  = stateToSave;
		}
		public String getSavedState(){
			return state;
		}
	}

}
