package task_0061;

public class Solution_2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution.printList(head);
        System.out.println();
        Solution_2 sol = new Solution_2();
        ListNode list = sol.rotateRight(head, 2000000000);
        Solution.printList(list);
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
            return head;
        }
        ListNode p = head;
        int len = 1;
        while(p.next != null) {
            p = p.next;
            len++;
        }
        p.next = head;
        k %= len;
        for(int i = 0; i < len - k; i++) {
            p = p.next;
        }
        head = p.next;
        p.next = null;
        return head;
    }
}
