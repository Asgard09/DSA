import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1046_Last_Stone_Weight {
    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int stone : stones){
            maxHeap.add(stone);
        }

        while (maxHeap.size() != 1) {
            maxHeap.add(maxHeap.poll() - maxHeap.poll());
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
