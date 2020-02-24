/**
 * @author Ehtiram_Abdullayev on 2/18/2020
 * @project leetcode-questions
 */
public class LeetCode_1108 {
    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            String a = String.valueOf(address.charAt(i));
            if (a.equals(".")) {
                a = "[.]";
            }
            builder.append(a);
        }
        return builder.toString();
    }
}
