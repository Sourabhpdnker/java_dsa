public class HoloRhombus {
    public static void holorhombs(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(" ");  
            }
            for (int j = 1; j <=n; j++) {
                if(i==1 || j==1||i == n || j==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        holorhombs(8);
        
    }
}
