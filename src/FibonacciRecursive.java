import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci (n-2);
    }

    public static int fibonacciN(int n){
        int[] fib = new int[2];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i <= n; ++i){
            fib[i%2] = fib[0] + fib[1];
        }
        return fib[n%2];
    }

}
