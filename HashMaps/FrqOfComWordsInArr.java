
import java.util.HashMap;

public class FrqOfComWordsInArr {
    public static void main(String[] args) {
        String[] s = {"sourabh", "soham","prabhas","sourabh","soham","samruddhi"};

        HashMap<String,Integer> map = new HashMap<>();

        for(String str : s){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        System.out.println(map);
    }
}
