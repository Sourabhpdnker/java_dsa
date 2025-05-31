
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = scan.nextInt();
        System.out.print("Enter second number : ");
        int b = scan.nextInt();
        System.out.print("Enter the operation that you want to perform : ");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result : " + (a + b));
                break;

            case '-':
                System.out.println("Result : " + (a - b));
                break;

            case '/':
                System.out.println("Result : " + (a / b));
                break;

            case '%':
                System.out.println("Result : " + (a % b));
                break;

            case '*':
                System.out.println("Result : " + (a * b));
                break;
            default:
                System.out.println("try again  . . .. ");
                throw new AssertionError();
        }
    }
}
