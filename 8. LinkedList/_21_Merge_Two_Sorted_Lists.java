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
        ListNode current = dummy;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    // Helper method to create a linked list from an array
    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Helper method to print a linked list
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create two linked lists
        int[] list1Values = {1, 2, 4};
        int[] list2Values = {1, 3, 4};

        ListNode list1 = createLinkedList(list1Values);
        ListNode list2 = createLinkedList(list2Values);

        // Print the input lists
        System.out.println("List 1:");
        printLinkedList(list1);
        System.out.println("List 2:");
        printLinkedList(list2);

        // Merge the lists
        ListNode mergedList = mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.println("Merged List:");
        printLinkedList(mergedList);
    }

}
