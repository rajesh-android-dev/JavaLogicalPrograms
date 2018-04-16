import java.util.Scanner;

/**
 * Get array of integer as input, and ask two numbers in the array and swap the index of the two
 */
public class SwapIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++){
            int b = sc.nextInt();
            a[i] = b;
        }
        System.out.println("Enter the numbers to swap");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int xIndex = 0;
        int yIndex = 0;
        for (int j = 0; j < 10; j++){
            if (a[j] == x){
                xIndex = j;
            }
            if (a[j] == y){
                yIndex = j;
            }
        }
        a[xIndex] = y;
        a[yIndex] = x;
        for (int m : a){
            System.out.println(m);
        }
    }
}
