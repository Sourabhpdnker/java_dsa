public class LongestSubarr {
    public static void main(String[] args) {
        int arr[] = { 2,5,1,7,10,2,3,4,5,1,1,1,11};
        int k = 14;
        int beststart = 0;
        int bestend = 0;
        int MaxLength = 0;
        for (int i = 0; i < arr.length; i++) {           
            int Current_sum = 0;
            for (int j = i; j < arr.length; j++) {      
                Current_sum += arr[j];

                if (Current_sum <= k) {
                    int current_length = j - i + 1;
                    if (current_length > MaxLength) {
                        MaxLength = current_length;
                        beststart = i;
                        bestend = j;
                    }
                } else {
                    break;
                }
            }
        }
        
        System.out.println("Maximum Length: " + MaxLength);
        System.out.print("Subarray: ");
        for (int i = beststart; i <= bestend; i++) {    
            System.out.print(arr[i] + " ");
        }
    }
}