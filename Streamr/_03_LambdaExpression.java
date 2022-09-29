package learning.Stream;

import learning.Stream._03_LambdaExpression.Printer;

public class _03_LambdaExpression {

	public static void main(String[] args) {
		//anonymous class
		Printer printer=new Printer() {
			public void print(String message) {
				System.out.println("message is" +message);
			}
		};
		//Lambda Function
		Printer secondPrinter=(message)->{
			System.out.println("message is"+message);
		};
		//simplified Lambda
		Printer thirdPrinter=message-> System.out.println("message is" +message);
		
		printer.print("This is anonymous class implementation");
		secondPrinter.print("This is Lambda expression implementation");
		thirdPrinter.print("This is Simplified lambda expression implementation");
		
		Operations operations=(a,b) -> a+b;
		System.out.println("Result is "+operations.add(50,70));

	}
	interface Operations{
		int add(int a, int b);
	}
	interface Printer{
		void print(String message);
	}

}
