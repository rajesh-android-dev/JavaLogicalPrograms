package general_problems;

import java.util.Scanner;

/**
 * Take two numbers from the user and print the result of multiplication and addition of all the numbers.
 * Eg., If the user presses 3 and 8 then 4+5+6+7 is 22 and 4*5*6*7 is 840
 */
public class AddMulBWNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        if (a > b){
            System.out.println("Please enter a valid number");
        }
        else {
            int sumResult = 0;
            int mulResult = 1;
            for (int i = a+1; i < b; i++){
                sumResult += i;
                mulResult *= i;
            }
            System.out.println("Sum: " + sumResult + "  Product: " + mulResult);
        }
    }
}
