import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        System.out.println("Select transaction type (+, -, *, /): ");
        char transaction = input.next().charAt(0);

        switch (transaction) {
            case '+':
                System.out.println("Result: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Result: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Result: " + (number1 * number2));
                break;
            case '/':
                if (number2 != 0) {
                    System.out.println("Result: " + (number1 / number2));
                } else {
                    System.out.println("Error: The denominator cannot be 0 in division!");
                }
                break;
            default:
                System.out.println("Invalid transaction! Please use +, -, * or /.");
                break;
        }
    }
}
