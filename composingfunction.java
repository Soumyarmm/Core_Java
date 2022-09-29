package learning.Stream;

import java.util.function.Function;

public class composingfunction {

	public static void main(String[] args) {
		 //1. name ->soumya-> UPPERCASE
        //2. name -> name:11 +  -> SOUMYA:11
        //3. name -> {name:length} -> {soumya = 6}

        Function<String, String> convertToUppercase = name -> name.toUpperCase();
        System.out.println("convertToUppercase -> " + convertToUppercase.apply("soumya"));

        Function<String, String> makeKeyValuePair = str -> str + ":" + str.length();
        System.out.println("makeKeyValuePair -> " + makeKeyValuePair.apply("SOUMYA"));

        Function<String, String> appendBrackets = str -> "{ " + str + " }";
        System.out.println("appendBrackets -> " + appendBrackets.apply("soumya"));

        String myName = "soumya";
        String soumya = convertToUppercase.andThen(makeKeyValuePair).andThen(appendBrackets).apply(myName);
        System.out.println("FINAL RESULT :-" + soumya);


    }
}

