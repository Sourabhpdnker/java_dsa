import java.util.HashSet;

public class ContainDublicats {
    public static void main(String[] args) {

        int[] nums = {1, 2, 5,1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                System.out.println("true");
                return;
            }

            set.add(num);
        }

        System.out.println("false");
    }
}