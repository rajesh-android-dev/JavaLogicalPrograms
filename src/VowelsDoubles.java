import java.util.Scanner;

/**
 * Find doubles in a string which are vowels
 */
public class VowelsDoubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = 0;
        if (input.length() <= 2) {
            if (isVowel(input.charAt(0)) && isVowel(input.charAt(1))) count++;
        } else {
            for (int i = 0; i <= input.length() - 2; i++) {
                if (isVowel(input.charAt(i)) && (isVowel(input.charAt(i + 1)))) count++;
            }
        }
        System.out.println("Vowel doubles " + count);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
