import java.util.*;

public class Vowel_c {

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }

    static char nearestVowel(char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        char answer = vowels[0];
        int minDistance = Integer.MAX_VALUE;

        for (char v : vowels) {
            int distance = Math.abs(ch - v);

            if (distance < minDistance) {
                minDistance = distance;
                answer = v;
            }
        }

        return answer;
    }

    static char nearestConsonant(char ch) {
        char[] consonants = {
            'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k',
            'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
            'v', 'w', 'x', 'y', 'z'
        };

        char answer = consonants[0];
        int minDistance = Integer.MAX_VALUE;

        for (char c : consonants) {
            int distance = Math.abs(ch - c);

            if (distance < minDistance) {
                minDistance = distance;
                answer = c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (isVowel(ch)) {
                result.append(nearestConsonant(ch));
            } else {
                result.append(nearestVowel(ch));
            }
        }

        System.out.println(result);
    }
}