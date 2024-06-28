package Task_0002;

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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode point = result;
        int add = 0;

        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int temp = val1 + val2 + add;
            add = temp / 10;
            temp = temp % 10;
            point.next = new ListNode(temp);
            point = point.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (add != 0) {
            point.next = new ListNode(add);
        }

        return result.next;
    }

    public static void main(String[] args) {
        // l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(4);
        listNode.next.next = new ListNode(2);

        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(6);
        listNode1.next.next = new ListNode(5);

        ListNode result = addTwoNumbers(listNode, listNode1);
        while (result != null){
            System.out.print(result.val);
            result = result.next;
        }
    }
}
