
public class PrimeNumInRange {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int n) {
        System.out.print("prime numbers are between 2 to" + n + " : ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Non prime numbers are between 2 to " + n + " : ");
        for (int i = 2; i <= n; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeInRange(10);

    }
}
