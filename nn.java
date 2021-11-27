package day7_switchStatement;

public class nn {

	public static void main(String[] args) {
		String day = “bb”;
		// Switch statement with do only one statement to check condition to execute
		switch (day) {
		case “yes”:
			System.out.println(“Monday”);
			break;
		case “no”:
			System.out.println(“Tuesday”);
			break; // to stop the code to be executed
		default: // work just similar to else statement
			System.out.println(“Invalid input”);

	}

}
