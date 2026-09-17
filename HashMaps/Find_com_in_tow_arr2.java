
import java.util.*;

public class Find_com_in_tow_arr2{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5};
        int[] b = {3,4,5,6,7};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int j = 0; j < b.length; j++) {
            if(set.contains(b[j])){
                System.out.print(b[j]+" , ");
            }
        }
    }
}