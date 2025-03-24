package task_2095;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode temp = head;
        ListNode fast = head.next;
        while (fast.next != null) {
            fast = fast.next.next;
            if (fast == null){
                break;
            }
            head = head.next;
        }

        head.next = head.next.next;
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        Solution solution = new Solution();
        ListNode result = solution.deleteMiddle(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }


    }
}
