import java.util.ArrayList;
import java.util.List;

/**
 * @author Ehtiram_Abdullayev on 2/18/2020
 * @project leetcode-questions
 */
public class LeetCode_1281 {
    public int subtractProductAndSum(int n) {
        List<Integer> integers = new ArrayList<>();
        while (n > 0) {
            integers.add(n - (n / 10) * 10);
            n = n / 10;
        }
        int multiply = 1;
        int adding = 0;
        for (Integer integer : integers) {
            multiply = multiply * integer;
            adding = adding + integer;
        }
        return multiply - adding;
    }

    public static void main(String[] args) {
        new LeetCode_1281().subtractProductAndSum(8974564);
    }
}
