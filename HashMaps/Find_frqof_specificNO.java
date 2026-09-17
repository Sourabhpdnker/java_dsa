
import java.util.HashMap;

public class Find_frqof_specificNO {
    public static void main(String[] args) {
        int[] nums = {5, 2, 5, 7, 5, 2, 8};
        int sp = 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map.get(sp));
    }
    
}
