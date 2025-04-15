import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class _347_Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k+1];

        HashMap<Integer, Integer> myMap = new HashMap<>();

        for(int num : nums){
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);
        }

        Queue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.getValue(), a.getValue())
        );

        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()){
            maxHeap.offer(entry);
        }

        for(int i = 0; i<k; i++){
            res[i] = maxHeap.poll().getKey();
        }

        return res;
    }
}
