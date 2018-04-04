import java.util.Scanner;

/**
 * Write a program that takes the height and breadth of a square and print the box of the height and width with alphabet B
 * Eg: If user presses 5 for height and 8 for width, the output will be
 *
 *      B B B B B B B B
 *      B B B B B B B B
 *      B B B B B B B B
 *      B B B B B B B B
 *      B B B B B B B B
 */
public class PrintBH {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = sc.nextInt();
        System.out.println("Enter no of cols:");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
                System.out.print("B");
            }
            System.out.println("");
        }
    }
}
