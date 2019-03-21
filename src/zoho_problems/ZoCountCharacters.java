package zoho_problems;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Submissions: 2749   Accuracy: 21.61%   Difficulty: Basic
 * <p>
 * Given a string S. The task is to count the characters that have ‘N’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence.
 * <p>
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a string S and a number N as input.
 * <p>
 * Output:
 * For each test case, print the count of characters in new line.
 * <p>
 * Input:
 * 2
 * abc 1
 * geeksforgeeks 2
 * <p>
 * Output:
 * 3
 * 4
 */
public class ZoCountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String val = sc.next();
            int occ = sc.nextInt();
            printOccurenceCount(val,occ);
        }
    }

    private static void printOccurenceCount(String val, int n) {
        StringBuffer sb = new StringBuffer();
        sb.append(val);
        for (int i = 0; i < val.length()-1;i++){
            if (val.charAt(i) == val.charAt(i+1))
                sb.deleteCharAt(i);
        }
        String newVal = sb.toString();
        HashMap<Character,Integer> hmVal = new HashMap<>();
        for (int i = 0; i < newVal.length();i++){
            int rep = 0;
            for (int j = 0; j < newVal.length();j++){
                if (newVal.charAt(i) == newVal.charAt(j)) rep++;
            }
            if (rep == n) hmVal.put(newVal.charAt(i),n);
        }
        System.out.println(hmVal.size());
    }
}
