public class SubArrays {
    public static void subarrays(int numbers[]){
        for (int i = 0; i <numbers.length; i++) {
            for (int j = i+1; j <numbers.length; j++) {
                System.out.print("[");
                for (int k = i; k < j; k++) {
                    System.out.print(numbers[k]+" ");
                }System.out.print("]");
                System.out.println();
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12};
        subarrays(numbers);
    }
}
