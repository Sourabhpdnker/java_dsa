
import java.util.*;

public class SimpleHashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("sourabh",99);
        map.put("yash",98);
        map.put("sam",100);
        System.out.println(map.get("sam")); 
        
        System.out.println(map.containsKey("sourabh"));

        HashSet<Integer> set = new HashSet<>();
        set.add(23);
        set.add(24);
        set.add(25);
        set.add(26);
        set.add(28);
        set.add(29);

        System.out.println(set);
    }
    
}
