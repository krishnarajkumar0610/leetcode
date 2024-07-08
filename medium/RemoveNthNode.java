package medium;

public class RemoveNthNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headTemp = head;
        ListNode prev = head;
        for (int i = 0; i < n; i++) {
            headTemp = headTemp.next;
        }
        if (headTemp == null) {
            return head.next;
        }
        while (headTemp.next != null) {
            headTemp = headTemp.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}
