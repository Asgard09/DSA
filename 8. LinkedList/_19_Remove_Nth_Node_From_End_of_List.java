public class _19_Remove_Nth_Node_From_End_of_List {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0,head);
        ListNode dummy = res;

        while (n > 0) {
            head = head.next;
            n--;
        }

        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;
        return res.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);

        removeNthFromEnd(head, 2);
    }
}
