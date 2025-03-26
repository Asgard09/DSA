import java.util.PriorityQueue;
import java.util.Queue;

public class _973_K_Closest_Points_to_Origin {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> maxHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(distance(a), distance(b))
        );

        for(int[] point : points){
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }

            maxHeap.add(point);
        }

        int[][] res = new int[k][2];
        for(int i = 0; i<k; i++){
            res[i] = maxHeap.poll();
        }

        return res;
    }

    public int distance(int[] point){
        return (int) Math.sqrt(Math.pow(point[0],2)+Math.pow(point[1], 2));
    }
}
