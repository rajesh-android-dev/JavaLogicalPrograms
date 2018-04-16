import java.util.Scanner;

/**
 * Print number of digits in the given number
 */
public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a < 10){
            System.out.println("No of Digits: 1");
        }else {
            int q = a;
            int result = 0;
            do {
                q /= 10;
                result++;
            }
            while (q != 0);

            System.out.println("No of Digits: " + result);
        }

    }
}
