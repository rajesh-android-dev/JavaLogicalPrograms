package general_problems;

/**
 * Using for loop, print the result of multiplication of all odd numbers from 1 to 20 and the result of sum of all
 * even numbers from 1 to 100
 */
public class MultiplicationOfOddEven {
    public static void main(String[] args) {
        int oddResult = 1;
        for(int i = 2; i <= 20; i++){
            if (i%2 != 0){
                oddResult *= i;
            }
        }

        int evenResult = 2;
        for (int j = 4; j <=100; j++){
            if (j%2 == 0){
                evenResult += j;
            }
        }
        System.out.println("odd : " + oddResult + " even: " + evenResult);

    }
}
