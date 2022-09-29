package learning.Stream;

public class _02_AnonymousClass {
	interface Printer{
		void print(String message);
	}
	static void show() {
		Printer printer=new Printer() {

			@Override
			public void print(String message) {
				System.out.println("This is abnonymous class for printer interface and your message is: " + message);
				
				
			}
			
		};
		printer.print("my custom message");
	}

	public static void main(String[] args) {
		show();

	}

}
