public class PairsInArrays {
    public static void pairsofarrays(int numbers[]){
        int totalp = 0;
        for (int i = 0; i <numbers.length; i++) {
            // System.out.println(numbers[0]);
            int currentnumber = numbers[i];
            for (int j = i+1; j<numbers.length; j++) {
                System.out.print("("+currentnumber+","+numbers[j]+")");
                totalp++;
            }System.out.println();   
        }System.out.println("total peirs = "+totalp);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12};
        pairsofarrays(numbers);
    }
}
