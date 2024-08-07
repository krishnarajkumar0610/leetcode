package easy;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode rabbit = head;
        while (rabbit != null && rabbit.next != null) {
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
            if (tortoise == rabbit)
                return true;
        }
        return false;
    }
}
