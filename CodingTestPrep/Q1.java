/*You are given two strings — you must determine if one string is a rearrangement (anagram) of the other.*/
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println(0);
            return;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
        
    }
    
}
