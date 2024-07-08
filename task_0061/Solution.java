package task_0061;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        printList(head);
        System.out.println();
        Solution sol = new Solution();
        ListNode list = sol.rotateRight(head, 2000000000);
        // time limit exceed :c, check sol 2
        printList(list);
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) return head;
        ListNode temp = head;
        while (k != 0) {
            if (temp.next.next == null) {
                temp = temp.next;
                temp.next = head;
                head.next = null;
            } else {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next.next = head;
                ListNode newTemp = temp;
                temp = temp.next;
                newTemp.next = null;
            }
            head = temp;
            k--;
        }
        return temp;
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while (temp.next != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val);
    }
}
