public class SubArraysAddition{
    public static void subarrays(int numbers[]){
        for (int i = 0; i <numbers.length; i++) {
            for (int j = i; j <numbers.length; j++) {
                int addSubArray = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    
                    System.out.print(numbers[k]+" ");
                    addSubArray = addSubArray+numbers[k];
                    
                }System.out.print("]");
                System.out.print("   addition of this sub array is = "+addSubArray);
                System.out.println();
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12};
        subarrays(numbers);
    }
}
