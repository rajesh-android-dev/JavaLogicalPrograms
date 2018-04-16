import java.util.Scanner;

/**
 * Print all the prime numbers between given integer and also print the total number and largest prime number
 */
public class CountPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int tot = 0;
        int largeNum = 0;
        boolean isPrime = true;

        for (int i = 2; i < limit; i++){
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
                if (isPrime){
                    System.out.println(i);
                    largeNum = i;
                    tot++;
                }
        }
        System.out.println("Total number: " + tot +"  large number: " + largeNum);
    }
}
