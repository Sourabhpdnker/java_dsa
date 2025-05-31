
import java.util.*;

public class IncomeTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your income in lakhs : ");
        int income = scan.nextInt();
        float tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax will be : " + tax + " Rs");
    }
}
