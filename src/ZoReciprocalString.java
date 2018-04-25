import java.util.Scanner;

/**
 * Find the reciprocal of a given string
 * i/p : ABC --> o/p : ZYX
 * i/p : XYZ --> o/p : CBA
 */
public class ZoReciprocalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getReciprocalOfString(sc.next());
    }

    public static void getReciprocalOfString(String input) {
        StringBuffer sbResult = new StringBuffer();
        char[] in = input.toCharArray();
        for (char c : in) {
            if (Character.isLetter(c)) {
                int val = 0;
                if (Character.isLowerCase(c)) {
                    val = 'z' - c + 'a';
                } else {
                    val = 'Z' - c + 'A';
                }
                sbResult.append((char) val);
            }
        }
        System.out.println(sbResult.toString());
    }

}
