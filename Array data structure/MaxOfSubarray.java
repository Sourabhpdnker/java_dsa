public class MaxOfSubarray{
    public static void maxsubarrays(int numbers[]){
        int addSubArray = 0;
        int Maxsum = Integer.MIN_VALUE;
        for (int i = 0; i <numbers.length; i++) {
            for (int j = i; j <numbers.length; j++) {
                addSubArray = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(numbers[k]+" ");
                    addSubArray = addSubArray+numbers[k];
                }
                System.out.print(addSubArray+" , ");
            }System.out.println();
            if(Maxsum < addSubArray){
                Maxsum = addSubArray;
            }
        }
        System.out.println("Maximum of addition : "+Maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxsubarrays(numbers);
    }
}
