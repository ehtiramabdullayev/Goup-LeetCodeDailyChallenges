/**
 * @author Ehtiram_Abdullayev on 2/21/2020
 * @project leetcode-questions
 */
public class LeetCode_1221 {
    public int balancedStringSplit(String s) {
        int res = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                counter++;
            } else {
                counter--;
            }
            if (counter == 0) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode_1221().balancedStringSplit("RLRRRLLRLL"));
    }
}
