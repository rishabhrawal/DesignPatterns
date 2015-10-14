package prototype;

public class BugattiVeyron implements Prototypable {
	
	String make = "Bugatti Veryon";
	String color = "Red and Black";
	int topSpeed = 0;
	
	@Override
	public BugattiVeyron clone() throws CloneNotSupportedException{
		System.out.println("Cloning Bugatti Veyron");
		return (BugattiVeyron)super.clone();
	}
	
}
