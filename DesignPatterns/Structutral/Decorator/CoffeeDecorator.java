package Decorator;

public abstract class CoffeeDecorator extends Coffee{
	protected final Coffee DecoratedCoffee;
	
	public CoffeeDecorator(Coffee coffee){
		this.DecoratedCoffee = coffee;
	}
	
	public double getCost(){
		return DecoratedCoffee.getCost();
	}
	
	public String getIngredients(){
		return DecoratedCoffee.getIngredients();
	}
}

class WithMilk extends CoffeeDecorator{
	
	public WithMilk(Coffee c){
		super(c);
	}
	
	public double getCost(){
		return super.getCost() + 2.5;
	}
	
	public String getIngredients(){
		return super.getIngredients() + " + Milk";
	}
}

class WithSprinkles extends CoffeeDecorator{
	
	public WithSprinkles(Coffee c){
		super(c);
	}
	
	public double getCost(){
		return super.getCost() + 2.5;
	}
	
	public String getIngredients(){
		return super.getIngredients() + " + Sprinkles";
	}
}
