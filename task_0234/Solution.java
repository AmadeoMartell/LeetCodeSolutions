package task_0234;

class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder str = new StringBuilder();
        while (head != null) {
            str.append(head.val);
            head = head.next;
        }

        return str.toString().equals(str.reverse().toString());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
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






