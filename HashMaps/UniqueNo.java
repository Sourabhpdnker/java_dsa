
import java.util.*;
public class UniqueNo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4,5,5,7,1};
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        System.out.println(set.size());
        
    }
}
