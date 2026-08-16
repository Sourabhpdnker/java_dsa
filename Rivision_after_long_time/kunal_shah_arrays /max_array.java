public class max_array{
    public static void main(String[] args) {
        int[] arr = {99,4,6,8,56,6};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        // System.out.println(max(arr));
        // System.out.println(maxRange(arr, 1, 4));
    }
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        
        }
        return maxVal;
        
    }
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        
        }
        return maxVal;
        
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j = 1; j< nums.length; j++){
            if(nums[j]!= nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
