import java.util.Scanner;

/**
 * Consider a matrix with n rows and m columns, where each cell contains either a 0 or a 1 and any cell containing a 1 is called a filled cell.
 * Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally;
 * If one or more filled cells are also connected, they form a region.
 * Note that each cell in a region is connected to at least one other cell in the region
 * but is not necessarily directly connected to all the other cells in the region.
 */
public class ConnectedCell {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(countCells(grid));
    }

    public static int countCells(int[][] grid){
        int max = 0;
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                max = Math.max(max,getRegionCount(grid, i , j));
            }
        }
        return max;
    }

    public static int getRegionCount(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return 0;
        }
        if(grid[i][j] == 0) return 0;
        int count = grid[i][j]--;
        count += getRegionCount(grid, i + 1, j);
        count += getRegionCount(grid, i - 1, j);
        count += getRegionCount(grid, i, j + 1);
        count += getRegionCount(grid, i, j - 1);
        count += getRegionCount(grid, i + 1, j + 1);
        count += getRegionCount(grid, i - 1, j - 1);
        count += getRegionCount(grid, i - 1, j + 1);
        count += getRegionCount(grid, i + 1, j - 1);
        return count;
    }
}
