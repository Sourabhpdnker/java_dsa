public class DeciToBinNumber {
    public static int deciToBinNum(int deciNum){
        int pow = 0;
        // int myDeciNum = 0;
        int binNum = 0;

        while (deciNum > 0) {
            int rem = deciNum % 2;
            binNum = binNum + ( rem * (int)Math.pow(10, pow));
            pow++;
            deciNum = deciNum/2;            
        }
        // System.out.println("the binary number of "+myDeciNum+" is : "+binNum);
        return binNum;
    }
    public static void binNumList(int deciNum){
        for (int i = 1; i < deciNum; i++) {
            System.out.println(deciToBinNum(i));
        }
    }
    public static void main(String[] args) {
        binNumList(100);
    }
}
