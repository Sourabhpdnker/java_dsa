
import java.util.HashSet;

public class Find_com_in_tow_arr{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,6,7};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    set.add(a[i]);
                }
                
            }
        }
        System.out.println(set);

    }
}