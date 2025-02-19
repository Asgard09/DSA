public class _142_Linked_List_Cycle_II {
    /*The begin of cycle always is the next point of the point that two pointers meet */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!= null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode start = head;

                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
            }

            return slow;
        }

        return null;
    }
}
