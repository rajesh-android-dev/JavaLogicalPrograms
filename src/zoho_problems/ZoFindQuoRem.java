package zoho_problems;

import java.util.Scanner;

/**
 * Find quotient and reminder for a given number and divisor without using / or %
 * i/p: number : 10, divisor : 2
 * o/p: quotient : 5, reminder : 0
 */
public class ZoFindQuoRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = sc.nextInt();
        printQuoRem(num, div);
    }

    private static void printQuoRem(int num, int div) {
        int quo = 0;
        while (num >= div){
            num -= div;
            quo++;
        }
        System.out.println("Quo : " + quo + " rem : " + num);
    }
}
