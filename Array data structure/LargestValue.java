public class LargestValue {
    public static void largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }   
        }System.out.println(largest);
        for (int i = 0; i < numbers.length; i++) {
            if(lowest > numbers[i]){
                lowest = numbers[i];
            }   
        }System.out.println(lowest);
    }

    public static void main(String[] args) {
        int numbers[] = {34,546,78,356,789,123,456,543,345};
        largest(numbers);

        
    }
}
