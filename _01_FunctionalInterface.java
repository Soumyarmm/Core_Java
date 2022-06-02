package com.java.eight.concepts;

public class _01_FunctionalInterface {
	public static void main(String[] args) {
		ConsolePrinter printer=new ConsolePrinter();
		printer.print();
	}
	interface printer{
		void print();//by default public
	}
	static class ConsolePrinter implements printer{
		public void print() {
			System.out.println("printing the contents");
		}
	}

}
