package Decorator;

public class SimpleCoffee extends Coffee{

	@Override
	public double getCost() {
		return 5;
	}

	@Override
	public String getIngredients() {
		return "Coffee";
	}
	
}
