package learning.Stream;

import java.util.function.Supplier;

class SupplierTest implements Supplier{
	public Object get() {
		return Math.random()*1000;
	}
}

public class _07_SupplierInterface {

	public static void main(String[] args) {
		
		//Implementation->Normal Interface->Class
	   SupplierTest randomNumber1=new SupplierTest();
	   randomNumber1.get();
	   
	   //implement ->Via anonymous class
	   Supplier<Double> randomNumber2=new Supplier<Double>() {
		   @Override
		   public Double get() {
			   return Math.random() *1000;
		   }
	   };
	   
	   //Implementation->Lambda Expression
	   Supplier<Double> randomNumber3=()-> Math.random()*1000;
	   
	   
	   System.out.println("randomNumber1->" +randomNumber1.get());
	   System.out.println("randomNumber2->" +randomNumber2.get());
	   System.out.println("randomNumber3->" +randomNumber3.get());


	}

}
