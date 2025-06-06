
public class HalfPiramidOfNumbers {

    public static void main(String[] args) {
        System.out.println("Half priramid pattarn using numbers . .");
        int n = 14;
        for (int i = 1; i <= n; i++) {
            for (int count = 1; count <= i; count++) {
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
