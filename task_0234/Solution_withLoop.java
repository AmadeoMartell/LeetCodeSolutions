package task_0234;

import java.util.ArrayList;
import java.util.List;

class Solution_withLoop {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_withLoop solution = new Solution_withLoop();
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));
        System.out.println(solution.isPalindrome(node));
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}






