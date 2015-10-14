package FactoryMethodPattern;

public class ConcreteProductFactory1 extends ProductFactory{
	public Product makeProduct(){
		return new ConcreteProduct1();
	}
}
