import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _347_Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // each elements in Queue is Map type
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a,b) -> Integer.compare(a.getValue(), b.getValue())
        );

        // Add elemts into heap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry);
        }

        int[] res = new int [k+1];
        for (int i = 0; i<=k; i++){
            res[i] = heap.poll().getKey();
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}
