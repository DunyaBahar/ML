package helloWorld;
import java.util.Scanner;

public class MessagePrinter {
	
	private String formatText(String userText) {
		userText = userText.toUpperCase();
		return userText;
	}
	
	public String getText() {
		Scanner scanner = new Scanner(System.in);
		String userText = scanner.nextLine();
		scanner.close();
		
		userText = formatText(userText);
		return userText;
	}

}
