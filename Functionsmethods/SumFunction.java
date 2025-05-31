
import java.util.*;

public class SumFunction {

    public static void calculateSum(int sa, int sb) {
        int sum = sa + sb;
        System.out.println("sum of two given input is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter . . . .");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);

    }
}
