/**
 * @author Ehtiram_Abdullayev on 2/18/2020
 * @project leetcode-questions
 */
public class LeetCode_1342 {

    public int numberOfSteps (int num) {
        int count=0;
        while (num>0){
            if(num%2==0){
                num=num/2;
            }
            else{
                num--;
            }
            count++;
        }
        return count;
    }
}
