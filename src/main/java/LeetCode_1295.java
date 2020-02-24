/**
 * @author Ehtiram_Abdullayev on 2/19/2020
 * @project leetcode-questions
 */
public class LeetCode_1295 {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (findNumberOfDigitsOfGivenNumber(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private int findNumberOfDigitsOfGivenNumber(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        new LeetCode_1295().findNumbers(new int[]{123, 43253, 1, 7});
    }
}
