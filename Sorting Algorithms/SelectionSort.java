public class SelectionSort {
    public static void selectionsort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minNum = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minNum]> arr[j]){
                    minNum = j;
                }
            }
            //sorting
            int temp = arr[minNum];
            arr[minNum] = arr[i];
            arr[i] = temp;
        }   
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,3,1};
        selectionsort(arr);
        printArray(arr);
    }
}
