package singleton;

public class CheckPattern {
	public static void main(String [] args){
		Singleton s1 = Singleton.getInstance();
		System.out.println("First Object : "+s1);
		Singleton s2 = Singleton.getInstance();
		System.out.println("Second Object : "+s2);
		if(s1==s2){
			System.out.println("Both the instances are same :) ");
		}else{
			System.out.println("Defferent Objects returned :( ");
		}
	}
}
