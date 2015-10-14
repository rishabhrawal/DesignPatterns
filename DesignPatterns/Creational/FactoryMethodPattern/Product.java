package FactoryMethodPattern;

public abstract class Product {
	
	private String productType = "Generic Product";
	
	public void setProductType(String productType){
		this.productType =  productType;
	}
	
	public String getProductType(){
		return productType;
	}
}
