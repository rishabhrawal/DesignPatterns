package prototype;

public class LamborghiniAventador implements Prototypable{

	String make = "Lamborghini Aventador";
	String color = "Orange";
	int topSpeed = 0;
	
	@Override
	public LamborghiniAventador clone() throws CloneNotSupportedException{
		System.out.println("Cloning Lamborghini Aventador");
		return (LamborghiniAventador)super.clone();
	}
}
