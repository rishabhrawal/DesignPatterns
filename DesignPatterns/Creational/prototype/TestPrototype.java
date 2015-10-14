package prototype;

import prototype.PrototypeFactory.ModelType;

public class TestPrototype {
	
	public static void main(String [] args){
		
		PrototypeFactory pFactory = new PrototypeFactory();
		try {
			
			BugattiVeyron bv = (BugattiVeyron)pFactory.getInstance(ModelType.BUGATTI_VEYRON);
			Porsche911 p911 = (Porsche911)pFactory.getInstance(ModelType.PORSCHE_911);
			LamborghiniAventador la = (LamborghiniAventador)pFactory.getInstance(ModelType.LAMBORGHINI_AVENTADOR);
		
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
