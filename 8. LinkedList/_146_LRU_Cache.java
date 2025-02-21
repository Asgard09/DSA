import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*Use to Node the one is MRU, another is LRU */
public class _146_LRU_Cache {
    class Node {
        int key, value;
        Node prev, next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer, Node> cache; // HashMap to store key-node mapping
    private Node head, tail; // Dummy head and tail

    public _146_LRU_Cache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();

        // Initialize dummy head and tail
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        // Move accessed node to the front (MRU position)
        Node node = cache.get(key);
        remove(node);
        insertToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            // Remove old node before inserting updated node
            remove(cache.get(key));
        } else if (cache.size() == capacity) {
            // Remove the least recently used node (from tail)
            cache.remove(tail.prev.key);
            remove(tail.prev);
        }

        // Insert new node at the front
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insertToFront(newNode);
    }

    // Helper function to remove a node from the list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Helper function to insert a node at the front (MRU position)
    private void insertToFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }


}
