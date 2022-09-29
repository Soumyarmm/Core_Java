package learning.Stream;

public class _01_Functionalinterface {
	interface Printer{
		void print();
	}
	static class ConsolePrinter implements Printer{
		public void print() {
			System.out.println("printing the contents");
		}
		
	}

	public static void main(String[] args) {
		ConsolePrinter printer=new ConsolePrinter();
		printer.print();

	}

}
