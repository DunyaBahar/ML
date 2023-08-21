package helloWorld;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("I'm robot. What's your name?");
		MessagePrinter printer = new MessagePrinter();
		String userName = printer.getText();
		System.out.println("Hello, " + userName);
		
		
//		MessagePrinter printer = new MessagePrinter();
//		printer.printText("This is a test");
		
	}
}
