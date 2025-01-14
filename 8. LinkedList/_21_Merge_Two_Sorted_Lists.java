import java.util.LinkedList;

public class _21_Merge_Two_Sorted_Lists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        while (list1!=null && list2!=null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
                
            }else{
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }
        curr.next =(list1!=null)? list1 : list2;
        return dummy.next;
    }

}
