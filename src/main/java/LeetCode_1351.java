/**
 * @author Ehtiram_Abdullayev on 2/19/2020
 * @project leetcode-questions
 */
public class LeetCode_1351 {

    //Use binary search for optimization or simply brute force.
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int i : row) {
                if (i < 0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = new int[19][5];
//        grid[0][0] = 5;
//        grid[0][1] = 1;
//        grid[0][2] = 0;
//        grid[1][0] = -5;
//        grid[1][1] = -5;
//        grid[1][2] = -5;

//        System.out.println(new LeetCode_1351().countNegatives(grid));
        System.out.println(grid.length);
        System.out.println(grid[0].length);
    }
}
