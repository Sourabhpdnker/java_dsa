public class SumOfConstWin {
    public static void main(String[] args) {
        int arr[] = {-1, 2,3,3,4,5,-1};
        int k =4;

        int left = 0;
        int right = k-1;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int Maxsum = sum;

        while(right < arr.length-1){
            sum = sum-arr[left];
            left++;
            right++;
            sum = sum+arr[right];

            Maxsum = Math.max(Maxsum, sum);

            
        }
        System.out.println(Maxsum);
    }

    
}
