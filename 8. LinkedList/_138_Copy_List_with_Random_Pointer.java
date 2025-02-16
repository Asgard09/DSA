import java.util.HashMap;

public class _138_Copy_List_with_Random_Pointer {
    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        /*Create a hashmap using store the original Node and the Copy Of Node */
        HashMap<Node,Node> myMap = new HashMap<>();
        Node current = head;

        while (current!=null) {
           myMap.put(current, new Node(current.val));
           current = current.next;
        }

        /*Must make current again equal to head because current being equal null*/
        current = head;

        while (current!=null) {
            Node copy = myMap.get(current);
            copy.next = myMap.get(current.next);
            copy.random = myMap.get(current.random);
            current = current.next;
        }

        return myMap.get(head);
    }

    
}
