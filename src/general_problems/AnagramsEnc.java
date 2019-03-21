package general_problems;

import java.util.Scanner;

/**
 * Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
 * We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string.
 */
public class AnagramsEnc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    public static int numberNeeded(String first, String second) {
    int result = 0;
    StringBuilder sbOuter = new StringBuilder();
    StringBuilder sbInner = new StringBuilder();
        sbOuter.append(first);
        sbInner.append(second);
    for (int i = 0; i < sbOuter.length(); i++) {
        int presentIndex = 0;
        boolean isPresent = false;
        for (int j = 0; j < sbInner.length(); j++) {
            if (sbOuter.charAt(i) == sbInner.charAt(j)) {
                presentIndex = j;
                isPresent = true;
                break;
            }
        }
        if (isPresent) sbInner.deleteCharAt(presentIndex);
        else result++;
    }

        StringBuilder sbOuter1 = new StringBuilder();
        StringBuilder sbInner1 = new StringBuilder();
        sbOuter1.append(second);
        sbInner1.append(first);

        for (int x = 0; x < sbOuter1.length(); x++){
            int presentIndex1 = 0;
            boolean isPresent1 = false;
            for (int y = 0; y < sbInner1.length(); y++){
                if (sbOuter1.charAt(x)==sbInner1.charAt(y)){
                    presentIndex1 = y;
                    isPresent1 = true;
                    break;
                }
            }
            if (isPresent1) sbInner1.deleteCharAt(presentIndex1);
            else result++;
    }
    return result;
    }
}
