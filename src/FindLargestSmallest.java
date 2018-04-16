import java.util.Scanner;

/**
 * Find the largest and smallest numbers among given 10 integers
 */
public class FindLargestSmallest {

    public static void main(String[] args) {
        findValues();
    }

    private static void findValues() {
        Scanner sc = new Scanner(System.in);
        int i = 2, small = 0, large = 0;
        System.out.println("Enter num 1:");
        int a = sc.nextInt();
        small = a;
        large = a;
        while (i <= 10) {
            System.out.println("Enter num " + i + ":");
            int b = sc.nextInt();
            if (b < small) {
                small = b;
            }
            if (b > large) {
                large = b;
            }
            i++;
        }
        System.out.println("Smaller number is : " + small + "  larger number is :" + large);
    }
}
