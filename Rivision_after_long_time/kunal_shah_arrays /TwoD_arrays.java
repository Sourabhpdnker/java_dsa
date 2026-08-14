import java.util.*;

public class TwoD_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
         for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" , ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int k = 0; k < arr.length; k++) {
            System.out.println(Arrays.toString(arr[k]));
        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        int[][] arr2 = {
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };
        int[]onedarr = {1,3,5,6,8,8};
        System.out.println(Arrays.toString(onedarr));
        for (int i = 0; i < onedarr.length; i++) {
            System.out.print(onedarr[i]);
        }
        System.out.println("______________________");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        for(int[] a : arr2){
            System.out.println(Arrays.toString(a));
        }
    }
    
}
