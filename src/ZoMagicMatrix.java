import java.util.Scanner;

/**
 * Find if given matrix is a magic matrix or not, A Magic Matrix is a n x n matrix of distinct element from 1 to n2
 * where sum of any row, column or diagonal is always equal to same number.
 */
public class ZoMagicMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] input = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                input[i][j] = sc.nextInt();
            }
        }
        System.out.println(isMagicMatrix(input));
    }

    private static boolean isMagicMatrix(int[][] val) {
        //prime diagonal sum
        //calculating sum of any one prime diagonal is enough, because if the sum of rows & cols is equal to any one
        // prime diagonal, then it's obvious that another prime diagonal will have the same result sum
        int pdSum = 0;
        for (int i = 0; i < val.length;i++){
            pdSum += val[i][i];
        }
        //row sum
        for (int i =0; i < val.length;i++){
            int rSum = 0;
            for (int j =0; j < val[i].length; j++){
                rSum += val[i][j];
            }
                if (pdSum != rSum) return false;
        }

        //col sum
        for (int i = 0; i< val.length;i++){
            int cSum = 0;
            for (int j = 0; j < val[i].length;j++){
                cSum += val[j][i];
            }
            if (pdSum != cSum) return false;
        }

        return true;
    }
}
