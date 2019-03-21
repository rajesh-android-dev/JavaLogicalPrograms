package zoho_problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Print odd positioned numbers as descending and even positioned numbers ascending in the given unsorted array
 * i/p : a = {7,2,4,5,1,9,8,10}
 * o/p: a = {10,9,5,2,1,4,1,7,8}
 */
public class ZoSortOddDescEvenAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] a = new int[length];
        for (int i = 0; i < length; i++){
            a[i] = sc.nextInt();
        }
        sortArray(a);
    }

    private static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++){
            if ((i & 1) != 0) a[i] *= -1;
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++){
            a[i] = Math.abs(a[i]);
        }
        for (int x : a)
            System.out.print(x + " ");
    }
}
