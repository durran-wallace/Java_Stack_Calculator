package stackCalculator;

import java.util.Scanner;

public class StackCalculatorApp {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);		
		StackCalculator calc = new StackCalculator();
		
		calc.displayWelcomeMessage();
		calc.displayCommands();
		
		while (!calc.command.equals("quit")) {
			System.out.print("stack> ");
			calc.command = scanner.nextLine().trim();  
            String[] tokens = calc.command.split(" ");
            String currentCommand = tokens[0];
			
			switch(currentCommand) {
			case "push":
				 if (tokens.length == 2) {
				        try {
				            double value = Double.parseDouble(tokens[1]);
				            calc.push(value);
				        } catch (NumberFormatException e) {
				            System.out.println("Error: " + tokens[1] + " is not a valid number.");
				        }
				    } else {
				        System.out.println("Error: 'push' command requires a numeric value.");
				    }
				    calc.listValues();
				    System.out.println("");
				    break;
			case "add":
				calc.add();
				calc.listValues();
				System.out.println("");
				break;
			case "sub":
				calc.sub();
				calc.listValues();
				System.out.println("");
				break;
			case "mult":
				calc.mult();
				calc.listValues();
				System.out.println("");
				break;
			case "div":
				calc.div();
				calc.listValues();
				System.out.println("");
				break;
			case "list":
				calc.listValues();
				System.out.println("");
				break;
			case "clear":
				calc.clearStack();
				System.out.println("");
				break;
			case "quit":
				System.out.println("\nThanks for using the Stack Calculator!");
				break;
			default:
				System.out.println("Unrecognized command");
			}
		} scanner.close();
	}

}
