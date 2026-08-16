import java.util.Arrays;

public class Swap_the_array_index {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,45};
        Swap(arr, 2, 4);
        reversethearray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reversethearray(int[] arr) {
        int index1 = 0;
        int index2 = arr.length-1;
        while(index1 < index2 ){
            Swap(arr, index1, index2);
            index1++;
            index2--;
        }
        
    }
}
  