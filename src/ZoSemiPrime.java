import java.util.Scanner;

/**
 * Find out if the give number is a semi prime or not
 * Semi prime means the multiples of two prime number will produce the given number
 */
public class ZoSemiPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isSemiPrime(sc.nextInt()));
    }

    public static boolean isSemiPrime(int n){
        int cnt = 0;
        for (int i = 2; cnt < 2 && i*i<=n;i++) {
            while (n % i == 0) {
                n /= i;
                cnt++;
            }
        }
            if (n > 1){
                cnt++;
            }
        return cnt == 2;
    }
}
