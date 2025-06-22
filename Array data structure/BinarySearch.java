public class BinarySearch {
    public static int Binary(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            System.out.println(mid);

            //compare
            if(numbers[mid] == key){
                return mid;
            }

            if(numbers[mid]< key){
                start = mid+1;
            }else{
                end = mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {4,8,12,15,16,71,34,67};
        int key =34;
        System.out.println(Binary(numbers, key));
    }
}
