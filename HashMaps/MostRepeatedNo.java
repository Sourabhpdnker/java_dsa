
import java.util.HashMap;

public class MostRepeatedNo {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,4};
        

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        int result = 0;
        for(int num : nums){
            if(map.get(num) > max){
                max = map.get(num);
                result = num;
            }

        }
        System.out.println(result);
    }
}
