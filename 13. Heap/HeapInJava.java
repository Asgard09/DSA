import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
/*
 * Built using a binary tree.
 * Used in Priority Queue implementations.
 * Two types: Max-Heap (The parent node is always greater than or equal to its children) and Min-Heap.
 */
public class HeapInJava {

    public static void main(String[] args) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(100);
        maxHeap.add(20);
        maxHeap.add(3);
        maxHeap.add(2);

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}