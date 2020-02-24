import java.util.HashSet;
import java.util.Set;

/**
 * @author Ehtiram_Abdullayev on 2/18/2020
 * @project leetcode-questions
 */
public class LeetCode_771 {
    public int numJewelsInStones(String J, String S) {
        Set<String> stringSet = new HashSet<String>();
        for (int i = 0; i < J.length(); i++) {
            stringSet.add(String.valueOf(J.charAt(i)));
        }

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (stringSet.contains(String.valueOf(S.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}
