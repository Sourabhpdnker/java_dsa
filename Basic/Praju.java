
public class Praju {

    public static void main(String[] args) {
        System.out.println("Half priramid pattarn using numbers . .");
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int count = n - i; count >= 1; count--) {
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
