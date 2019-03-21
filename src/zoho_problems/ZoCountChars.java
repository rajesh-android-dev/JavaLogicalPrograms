package zoho_problems;

import java.util.Scanner;

/**
 * Given a string S. The task is to count the characters that have ‘N’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence.
 *
 * Input:
 * 2
 * abc 1
 * geeksforgeeks 2
 *
 * Output:
 * 3
 * 4
 */
public class ZoCountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String val = sc.next();
            int x = sc.nextInt();
            printReps(val, x);
        }
    }

    public static void printReps(String val, int n) {
        StringBuffer sb = new StringBuffer();
        sb.append(val);
        for (int i = 0; i < val.length() - 1; i++) {
            if (val.charAt(i) == val.charAt(i + 1)) {
                sb.deleteCharAt(i);
            }
        }
        String newVal = sb.toString();
        int count = 0;
        for (int i = 0; i < newVal.length(); i++) {
            int reps = 0;
            for (int j = 0; j < newVal.length(); j++) {
                if (newVal.charAt(i) == newVal.charAt(j)) {
                    reps++;
                }
                if (reps == n) count++;
            }
            System.out.println("" + count);
        }
    }
}
