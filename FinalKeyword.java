package learning.encapsiulation;
class Demo{
	void show() {
		System.out.println("i am demo");
	}
}

public class FinalKeyword  extends Demo{
	void show() {
		System.out.println("override");
	}

	public static void main(String[] args) {
		/* final int i=90;  //final variable
		System.out.println(i);*/
	
	}

}
//final methods can't override.
//final variable can't change their value.
//final class can't access or inherit by other class.
