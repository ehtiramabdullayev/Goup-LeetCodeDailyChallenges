import java.util.Stack;

/**
 * @author Ehtiram_Abdullayev on 2/21/2020
 * @project leetcode-questions
 */
public class LeetCode_1290 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }


    }

    public int getDecimalValue1(ListNode head) {
        int total = 0;
        int count = 0;

        int len = length(head) - 1;
        while (head != null) {
            total = (int) (total + head.val * (Math.pow(2, len - count)));
            head = head.next;
            count++;
        }
        return total;
    }

    public int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int pow2 = 1;
        while (head != null) {
            stack.add(head.val);
            System.out.println(head.val);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            res = res + pow2 * stack.pop();
            pow2 = pow2 * 2;
        }
        return res;
    }


    private int length(ListNode listNode) {
        int len = 0;
        while (listNode != null) {
            listNode = listNode.next;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        // [1,0,1]  ==  1 * 2(0) + 0 * 2(1) + 1 * 2(2)

        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        new LeetCode_1290().getDecimalValue(head);
    }
}
