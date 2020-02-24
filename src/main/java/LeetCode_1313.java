import java.util.ArrayList;
import java.util.List;

/**
 * @author Ehtiram_Abdullayev on 2/18/2020
 * @project leetcode-questions
 */
public class LeetCode_1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < nums.length / 2; i++) {
            int freq = nums[2 * i];
            int val = nums[2 * i + 1];
            for (int b = 0; b < freq; b++) {
                integers.add(val);
            }
        }
        int[] result = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            result[i] = integers.get(i);
        }
        return result;
    }
}
