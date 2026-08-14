import java.util.Arrays;
import java.util.Scanner;

public class practice_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sourabh");
        int[] roll_no = new int[5];
        roll_no[0] = 23;
        roll_no[1] = 45;
        roll_no[2] = 48;
        roll_no[3] = 49;
        roll_no[4] = 65;
        
        int[] myno = {12,13,14,15};
        String[] myname = new String[3];
        System.out.println(roll_no[4]);
        System.out.println(myno[1]);
        System.out.println(myname[0]);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            
        }
        
        scan.close();
        for (int num : arr) {
            System.out.print(num+ "  ");   
        }
        System.out.println(Arrays.toString(arr));
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = scan.next();
            
        }
        str[2] = "sourabh";
        System.out.println(Arrays.toString(str));


    }
} 
     