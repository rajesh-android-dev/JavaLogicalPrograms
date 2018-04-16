import java.util.Scanner;

/**
 * Find the exponent value for given base and power using do-while loop
 */
public class ExponentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        int b = sc.nextInt();
        System.out.println("Power: ");
        int e = sc.nextInt();
        int result = 1, i = 1;
        do {
            result *= b;
            i++;
        }while (i <= e);
        System.out.println("Ans: " + result);
    }
}
