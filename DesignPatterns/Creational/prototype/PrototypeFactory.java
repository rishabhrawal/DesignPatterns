package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	
	public static class ModelType{
		public static final String LAMBORGHINI_AVENTADOR = "LamborghiniAventador";
		public static final String BUGATTI_VEYRON = "BugattiVeyron";
		public static final String PORSCHE_911 = "Porsche911";
	}
	
	private static Map<String , Prototypable> prototypes = new HashMap<String , Prototypable>();
	
    static
    {
        prototypes.put(ModelType.LAMBORGHINI_AVENTADOR, new LamborghiniAventador());
        prototypes.put(ModelType.BUGATTI_VEYRON, new BugattiVeyron());
        prototypes.put(ModelType.PORSCHE_911, new Porsche911());
    }
 
    public static Prototypable getInstance(final String s) throws CloneNotSupportedException {
        return ((Prototypable) prototypes.get(s)).clone();
    }
}

