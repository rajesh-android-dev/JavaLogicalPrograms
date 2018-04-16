import java.util.Scanner;

/**
 * Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
 * We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string.
 */
public class AnagramsEnc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    public static int numberNeeded(String first, String second) {
        int[] lettersCount = new int[26];
        for (char c : first.toCharArray()){
            lettersCount[c-'a']++;
        }
        for (char c : second.toCharArray()){
            lettersCount[c-'a']--;
        }
        int result = 0;
        for (int i : lettersCount){
            result += Math.abs(i);
        }
        return result;
    }
}
