package calculator;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Simple Calculator! ");
		
		try {
			
			
			System.out.print("Enter the first number: ");
			double num1 = scanner.nextDouble();
			
			System.out.print("Enter the second number: ");
			double num2 = scanner.nextDouble();
			
			System.out.print("Choose an operation (+, -, *, / ): ");
			char operation = scanner.next().charAt(0);
			
			double result;
			
			//switch case based on operation
			
			
			switch (operation) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					if(num2 == 0) {
						System.out.println("Error: Cannot divide by 0!");
						return;
					}
					result = num1 / num2;
					break;
				default:
					System.out.print("Invaild operation!");
					return;
			}
			
			System.out.println("The result is: "+ result);
		} catch (Exception e) {
			System.out.println("Invalid input! Please enter a valid number!");
		}
		
		scanner.close();
	}

}
