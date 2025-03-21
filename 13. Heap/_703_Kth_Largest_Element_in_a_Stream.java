import java.util.PriorityQueue;
/*Use minHeap because the head of minHeap always min val */
public class _703_Kth_Largest_Element_in_a_Stream {
    private static PriorityQueue<Integer> minHeap;
    private static int k;

    public _703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(); // Min-Heap
        
        for (int num : nums) {
            add(num); // Add initial elements
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) { // Keep only k elements
            minHeap.poll();
        }
        return minHeap.peek(); // k-th largest element
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        _703_Kth_Largest_Element_in_a_Stream res = new _703_Kth_Largest_Element_in_a_Stream(3, nums);
        System.out.println(res.add(3));
        System.out.println(res.add(5));
        System.out.println(res.add(10));
        System.out.println(res.add(9));
        System.out.println(res.add(4));

    }
}
