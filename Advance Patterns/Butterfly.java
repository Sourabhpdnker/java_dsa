public class Butterfly {
    public static void butterfly(int n){
        for (int i = 0; i <=n; i++) {
            //for printting a stars 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");  
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  
            }
            System.out.println();   
        }
        for (int i = n; i >=1; i--) {
            //for printting a stars 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");  
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  
            }
            System.out.println();  
        }
    }
    public static void main(String[] args) {
        butterfly(4);
        
    }
}
