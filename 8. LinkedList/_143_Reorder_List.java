public class _143_Reorder_List {
    public void reorderList(ListNode head) {
        if (head == null) return;

        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;

        while (fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode curr = slow.next;
        ListNode second = null;
        slow.next = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = second;
            second = curr;
            curr = temp;
        }

        // Step 3: Merge the two halves
        ListNode one = head;
        
        while (one != null && second != null) {
            ListNode temp1 = one.next;
            ListNode temp2 = second.next;
            one.next = second;
            second.next = temp1;
            one = temp1;
            second = temp2;
        }
    }
}
