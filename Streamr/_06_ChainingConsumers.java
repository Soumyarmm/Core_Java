package learning.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _06_ChainingConsumers {

	public static void main(String[] args) {
		List<String> stringList=Arrays.asList("Raghu","somu","Rama","Rocks");
		  //1.Convert to uppercase
		  //2.Append 234 to it.
		  //3.Printing the name as it is.
		Consumer<String> convertToUpperCase=name -> System.out.println(name.toUpperCase());
		Consumer<String> append234=name -> System.out.println(name.concat("234"));
		Consumer<String> printName=name -> System.out.println(name);
		Consumer<String> printSeparator=name -> System.out.println("\n............");
		
       stringList.forEach(printName.andThen(convertToUpperCase).andThen(append234).andThen(printSeparator));
	}

}
