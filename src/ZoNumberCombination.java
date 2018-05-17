import java.util.Scanner;

/**
 * For a given number. find the total number of arrays of combinations in which not one combination shouldn't
 * have the number exceeding 26
 *
 * i/p - 1526
 * o/p - 4
 *
 * for 1526, there will be 4 combinations {1,5,2,6} {15,2,6} {1,5,26} {15,26}
 */
public class ZoNumberCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findNumOfCombinations(sc.nextInt());
    }

    private static void findNumOfCombinations(int num) {
        //convert the number into array elements with single digits
        int n = String.valueOf(num).length();
        int [] arr = new int[n];
        for (int i = n-1; i >= 0; i--){
            arr[i] = num % 10;
            num /= 10;
        }

        int comb = 1; //starts with 1, because an array of single digits element is possible

        //for a single two digit element in the array
        for (int i =0; i < n; i++){
            boolean isValid = false;
            for (int j = i+1; j <= n-1; j++){
                if (i == j-1){
                    int x  = arr[i]*10+arr[j];
                    isValid = x  <= 26;
                    if (!isValid) break;
                }
            }
            if (isValid) comb++;
        }

        //for all 2 digits element in the array
        boolean isValid = true;
        for (int i = 0; i < n; i +=2){
            int x = arr[i]*10+arr[i+1];
            isValid = x <= 26;
            if (!isValid) break;
        }
        if (isValid) comb++;

        System.out.println("Possible combinations are " + comb);
    }
}
