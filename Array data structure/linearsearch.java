public class linearsearch {
    public static int linearsearchfun(int numbers[],int key){
        for (int i = 0; i < numbers.length; i++) {
            if(key == numbers[i] ){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 11;
        int index = linearsearchfun(numbers, key);
        if(index == -1){
            System.out.println("NUMBER IS NOT FOUND");
        }else{
            System.out.println(index);
        }
    }
}
