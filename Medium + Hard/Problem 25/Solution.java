import common.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (true) {
            ListNode node = prev;
            for (int i = 0; i < k && node != null; i++) node = node.next;
            if (node == null) break; // fewer than k
            ListNode cur = prev.next;
            ListNode next = cur.next;
            for (int i = 1; i < k; i++) {
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = cur.next;
            }
            prev = cur;
        }
        return dummy.next;
    }
}
