import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSWithQueue {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 1, 0, 0},
            {0, 1, 0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 0, 1},
            {0, 0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0}
        };
        // Declare
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> browsed = new HashSet<>();

        //Initialize
        queue.add(0);
        browsed.add(0);

        //Browse by stack
        while (!queue.isEmpty()) {
            int u = queue.remove();
            // process u
            System.out.print(u + " ");
            // Add all adjacent peak v with u that not browsed in stack


            for(int v = 0; v<graph.length; v++){
                if (graph[u][v] == 1 && browsed.contains(v) == false) {
                    queue.add(v);
                    browsed.add(v);
                }
            }
        }
    }
}
