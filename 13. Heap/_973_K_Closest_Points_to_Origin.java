import java.util.PriorityQueue;
import java.util.Queue;

public class _973_K_Closest_Points_to_Origin {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> maxHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(distance(b), distance(a))
        );

        for(int[] point : points){
            maxHeap.add(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }


        }

        int[][] res = new int[k][2];
        for(int i = 0; i<k; i++){
            res[i] = maxHeap.poll();
        }

        return res;
    }

    public int distance(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
}
