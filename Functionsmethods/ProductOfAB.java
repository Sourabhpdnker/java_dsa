
public class ProductOfAB {

    public static int multipy(int a, int b) {
        int product = a * b;
        return product;

    }

    public static void main(String[] args) {

        int a = 7;
        int b = 8;
        int prod = multipy(a, b);
        System.out.println("product of a and b is :" + prod);
        prod = multipy(10, 20);
        System.out.println(prod);
    }
}
