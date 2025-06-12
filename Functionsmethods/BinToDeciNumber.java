public class BinToDeciNumber {

    public static void binToDeciNum(int binNum){
        int myBinNUmber = binNum;
        int pow = 0;
        int deciNum = 0;

        while(binNum > 0){
            int lastNum = binNum % 10;
            deciNum = deciNum +(lastNum * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println(" Decimal number of "+myBinNUmber+" is "+deciNum);
        
    }
    public static void main(String[] args) {
        binToDeciNum(1001);
        
    }
}
