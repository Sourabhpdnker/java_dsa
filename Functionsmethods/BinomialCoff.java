
public class BinomialCoff {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinomialCoff(int n, int r) {
        int factorial_n = factorial(n);
        int factorial_r = factorial(r);
        int factorial_nmr = factorial(n - r);

        int binomial_coff = factorial_n / (factorial_r * (factorial_nmr));
        return binomial_coff;
    }

    public static void main(String[] args) {
        System.out.println(BinomialCoff(5, 2));

    }
}
