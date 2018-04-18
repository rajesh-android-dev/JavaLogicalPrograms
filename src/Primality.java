import java.util.Scanner;

/**
 * A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Given n integers, determine the primality of each integer and print whether it is Prime or Not prime on a new line.
 */
public class Primality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }
    }

    public static String isPrime(int n){
        boolean isPrime = true;
        if(n == 1)
            return "Not prime";
        if(n == 2 || n == 3)
            return "Prime";
        if(n % 2 == 0)
            return "Not prime";
        int m = (int) Math.sqrt(n);
        for(int i = 2; i <= m; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime ? "Prime" : "Not prime";
    }
}
