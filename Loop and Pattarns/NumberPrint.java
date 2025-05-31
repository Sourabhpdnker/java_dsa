
import java.util.Scanner;

public class NumberPrint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n  . . ");
        int n = scan.nextInt();
        int count = 1;
        int sum = 0;
        while (count <= n) {
            sum = sum + count;
            count++;
        }
        System.out.println("This is the sum of N natural numbers that you entred : " + sum);
    }
}
