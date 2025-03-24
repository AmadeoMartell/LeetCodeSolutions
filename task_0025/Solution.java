package task_0025;
import java.util.ArrayList;
import java.util.Arrays;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head.next == null) {
            return head;
        }
        ArrayList<ListNode> list = new ArrayList<ListNode>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }

        ListNode[] arr = list.toArray(new ListNode[list.size()]);
        int length = arr.length;
        for (int i = 0; i < length; i += k) {
            int left = i;
            int right = i + k - 1;

            while (left < right && right < length) {
                ListNode temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        ListNode dummy = new ListNode();
        ListNode dummyHead = dummy;

        for (ListNode i : arr) {
            i.next = null;
            dummy.next = i;
            dummy = dummy.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = solution.reverseKGroup(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }


    }
}
