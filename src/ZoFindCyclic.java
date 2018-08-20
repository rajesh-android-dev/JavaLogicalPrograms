import java.util.Scanner;

/**
 * Find if a given number is a cyclic number or not, A cyclic number means if its multiplied by any number will
 * give the result where it contains all the same digits.
 * I/P : 142857
 * O/P : Yes
 */
public class ZoFindCyclic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isCyclicNumber(sc.nextInt()));
    }

    private static boolean isCyclicNumber(long num) {
        // Count digits and check if all
        // digits are same
        int count = 0;
        long x = num;
        long digit = num%10;
        boolean allSame = true;
        while (x > 0) {
            count++;
            if (num%10 != digit) allSame = false;
            x /= 10;
        }

        //if all digits are same, then it's not a cyclic number
        if (allSame) return false;

        // If counts of digits is even and
        // two halves are same, then the
        // number is not considered cyclic.
        if (count % 2 == 0) {
            long halfPower = (long)Math.pow(10, count / 2);
            long firstHalf = num % halfPower;
            long secondHalf = num / halfPower;
            if (firstHalf == secondHalf && isCyclicNumber(firstHalf))
                return false;
        }

        //here we are doing a cyclic shifting and check if the number is divisible by shifted number
        long n = num;
        while (true) {
            long rem = num % 10;
            long div = num / 10;
            num = (long) (Math.pow(10, count - 1) * rem + div);

            if (num == n) break;
            if (num % n != 0) return false;
        }
        return true;
    }
}
