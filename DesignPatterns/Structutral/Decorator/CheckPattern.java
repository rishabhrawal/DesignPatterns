package Decorator;

public class CheckPattern {
	public static void main(String [] args){
		Coffee c = new SimpleCoffee();
		Coffee withMilk = new WithMilk(c);
		System.out.println("*********With Milk*********");
		System.out.println("Cost : "+withMilk.getCost());
		System.out.println("Ingredients :"+withMilk.getIngredients());
		Coffee withSprinkles = new WithSprinkles(withMilk);
		System.out.println("***With Milk & Sprinkles****");
		System.out.println("Cost : "+withSprinkles.getCost());
		System.out.println("Ingredients :"+withSprinkles.getIngredients());
		
	}
}
