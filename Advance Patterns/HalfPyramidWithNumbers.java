public class HalfPyramidWithNumbers {
    public static void halfPywithnum(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=1+n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfPywithnum(6);
    }
    
}
