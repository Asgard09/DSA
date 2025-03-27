import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _215_Kth_Largest_Element_in_an_Array {
    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> myHeap = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int num : nums){
            myHeap.offer(num);
        }

        for(int i = 1; i<k ; i++){
            myHeap.poll();
        }

        return myHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));
    }
}
