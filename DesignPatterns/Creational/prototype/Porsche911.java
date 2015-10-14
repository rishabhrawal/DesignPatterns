package prototype;

public class Porsche911 implements Prototypable {
	String make = "Porsche 911";
	String color = "Black";
	int topSpeed = 0;
	
	@Override
	public Porsche911 clone() throws CloneNotSupportedException{
		System.out.println("Cloning Porsche 911");
		return (Porsche911)super.clone();
	}

}
