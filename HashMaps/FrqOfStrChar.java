
import java.util.*;

public class FrqOfStrChar {
    public static void main(String[] args) {
        String s = "hello";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char str : s.toCharArray()){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        System.out.println(map);
    }
    
}
