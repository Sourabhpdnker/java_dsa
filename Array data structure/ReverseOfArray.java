public class ReverseOfArray {
    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while (first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4,6,8,10};
        reverse(numbers);
        System.out.print("reverse od array is : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
            
        }
        System.out.println();

    }
}
