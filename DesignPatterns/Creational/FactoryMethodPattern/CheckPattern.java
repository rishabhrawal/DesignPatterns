package FactoryMethodPattern;

public class CheckPattern {
	
	public static void main(String [] args){
		ProductFactory pf = new ConcreteProductFactory1();
		Product p = pf.makeProduct();
		System.out.println("Product created of type : "+p.getProductType());
	}

}
