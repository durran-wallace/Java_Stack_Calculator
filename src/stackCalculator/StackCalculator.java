package stackCalculator;
import java.util.Stack;
import java.util.Iterator;
import java.util.ArrayList;

public class StackCalculator {
	
	private Stack<Double> calculator = new Stack<>();
	public String command = "";
	
	public StackCalculator() {
        calculator = new Stack<>();
        command = "";
    }
	
	public void displayWelcomeMessage(){
		System.out.println("Welcome to the Stack Calculator\n");
	}
	
	public void displayCommands() {
		System.out.println("Commands: push n, add, sub, mult, div, list, clear, or quit.\n");
	}
	
	public void push(double value) {
	    calculator.push(value);
	}
	
	public void pop(double num) {
		calculator.pop();
	}
	
	public int size() {
		return calculator.size();
	}
	
	public ArrayList<Double> getValues() {
	    ArrayList<Double> values = new ArrayList<>();
	    for (Double value : calculator) {
	        values.add(value);
	    }
	    return values;
	}
	
	public void listValues() {
		if (calculator.size() == 0) {
			System.out.println("Empty");
		} else {
			Iterator<Double> iterator = calculator.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		
        }
	}
	
	public void clearStack() {
		calculator.clear();
	}	
	
	public void push(Double input) {
		calculator.push(input);
	}
	
	public void add() {
		if (calculator.size() < 2) {
			System.out.println("Error: Not enough numbers in the stack\n");
		} else {
			double num1 = calculator.pop();
			double num2 = calculator.pop();
			calculator.push(num1 + num2);
		}
		
	}
	
	public void sub() {
		if (calculator.size() < 2) {
			System.out.println("Error: Not enough numbers in the stack\n");
		} else {
			double num1 = calculator.pop();
			double num2 = calculator.pop();
			calculator.push(num1 - num2);
		}
		
	}
	
	public void mult() {
		if (calculator.size() < 2) {
			System.out.println("Error: Not enough numbers in the stack\n");
		} else {
			double num1 = calculator.pop();
			double num2 = calculator.pop();
			calculator.push(num1 * num2);
		}
		
	}
	
	public void div() {
		if (calculator.size() < 2) {
			System.out.println("Error: Not enough numbers in the stack\n");
		} else {
			double num1 = calculator.pop();
			double num2 = calculator.pop();
			calculator.push(num1 / num2);
		}
		
	}
}
