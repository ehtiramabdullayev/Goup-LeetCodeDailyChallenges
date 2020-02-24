import java.util.ArrayList;
import java.util.List;

/**
 * @author Ehtiram_Abdullayev on 2/21/2020
 * @project leetcode-questions
 */
public class LeetCode_1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
//               if(i+1 > i )

                //System.out.println("i= " + i + " ; j = " + j + " " + points[i][j]);

                lists.add(new ArrayList<>(points[i][j]));
            }

        }
        return 0;
    }
}
