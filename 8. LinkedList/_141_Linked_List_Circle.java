public class _141_Linked_List_Circle {
    public boolean hasCycle(ListNode head) {
        ListNode i = head;
        ListNode j = head;

        while (i.next!= null && j.next!=null) {
            i = i.next;
            j = j.next.next;

            if (i == j) {
                return true;
            }
        }
        return false;
    }
}