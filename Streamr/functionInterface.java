package learning.Stream;

import java.util.function.Function;

public class functionInterface {

	public static void main(String[] args) {
		//Lambda Function
		Function<String , Integer>fetchSize=str-> str.length();
		System.out.println("Length of my name:" + fetchSize.apply("Soumya"));

	}

}
