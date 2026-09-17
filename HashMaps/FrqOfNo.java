
import java.util.HashMap;

public class FrqOfNo{
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3,4,4,5,5,5,5,5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}